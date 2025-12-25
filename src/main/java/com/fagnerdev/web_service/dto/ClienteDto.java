package com.fagnerdev.web_service.dto;

import java.util.List;

public record ClienteDto(
        Long id,
        String nome,
        String email,
        String telefone,
        List<PedidoDto> pedidos
) {}
