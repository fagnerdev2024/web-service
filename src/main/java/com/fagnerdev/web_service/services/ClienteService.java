package com.fagnerdev.web_service.services;

import com.fagnerdev.web_service.dto.ClienteDto;
import com.fagnerdev.web_service.entities.Cliente;
import com.fagnerdev.web_service.mapper.ClienteMapper;
import com.fagnerdev.web_service.repositories.ClienteRepository;
import com.fagnerdev.web_service.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDto> buscar() {
        return clienteRepository.findAll()
                .stream()
                .map(ClienteMapper::toDto)
                .toList();
    }

    public ClienteDto buscarPorId(Long id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente não encontrado. Id: " + id));
        return ClienteMapper.toDto(cliente);
    }
}
