package com.fagnerdev.web_service.controller;


import com.fagnerdev.web_service.entities.Cliente;
import com.fagnerdev.web_service.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {


    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        List<Cliente> clienteList = clienteService.buscar();
        return ResponseEntity.ok().body(clienteList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Cliente cliente = clienteService.findById(id);
        return ResponseEntity.ok().body(cliente);
    }


}
