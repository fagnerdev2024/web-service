package com.fagnerdev.web_service.dto;

import com.fagnerdev.web_service.entities.Cliente;


public record UserDTO(Long id, String name, String email, String phone) {

    public UserDTO(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
    }
}

