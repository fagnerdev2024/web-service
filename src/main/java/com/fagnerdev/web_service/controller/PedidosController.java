package com.fagnerdev.web_service.controller;

import com.fagnerdev.web_service.entities.Pedido;
import com.fagnerdev.web_service.services.PedidosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidosController {


    private final PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> buscarTodos() {
        List<Pedido> list = pedidosService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        Pedido obj = pedidosService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
