package com.fagnerdev.web_service.services;

import com.fagnerdev.web_service.entities.Produto;
import com.fagnerdev.web_service.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {


    private final ProdutoRepository produtoRepository;


    public ProdutosService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    public Produto findById(Long id) {
        Optional<Produto> product = produtoRepository.findById(id);
        return product.get();
    }
}
