package com.fagnerdev.web_service.controller;

import com.fagnerdev.web_service.entities.Produto;
import com.fagnerdev.web_service.services.ProdutosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProductController {


    private final ProdutosService produtosService;

    public ProductController(ProdutosService produtosService) {
        this.produtosService = produtosService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodos() {
        List<Produto> list = produtosService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        Produto produto = produtosService.findById(id);
        return ResponseEntity.ok().body(produto);
    }
}
