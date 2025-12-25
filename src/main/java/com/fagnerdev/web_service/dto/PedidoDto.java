package com.fagnerdev.web_service.dto;

import com.fagnerdev.web_service.entities.enums.OrderStatus;

import java.time.Instant;

public record PedidoDto(
        Long id,
        Instant dataAtual,
        OrderStatus statusDoPedido
) {}

