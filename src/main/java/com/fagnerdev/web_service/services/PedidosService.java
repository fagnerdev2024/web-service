package com.fagnerdev.web_service.services;

import com.fagnerdev.web_service.entities.Pedido;
import com.fagnerdev.web_service.repositories.PedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosService {


    private final PedidosRepository pedidosRepository;

    public PedidosService(PedidosRepository repository) {
        this.pedidosRepository = repository;
    }

    public List<Pedido> findAll() {
        return pedidosRepository.findAll();
    }

    public Pedido findById(Long id) {
        Optional<Pedido> obj = pedidosRepository.findById(id);
        return obj.get();
    }
}
