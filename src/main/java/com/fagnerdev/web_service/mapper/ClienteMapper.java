package com.fagnerdev.web_service.mapper;

import com.fagnerdev.web_service.dto.ClienteDto;
import com.fagnerdev.web_service.dto.PedidoDto;
import com.fagnerdev.web_service.entities.Cliente;
import com.fagnerdev.web_service.entities.Pedido;

import java.util.List;

public final class ClienteMapper {

    private ClienteMapper() {}

    public static ClienteDto toDto(Cliente cliente) {
        if (cliente == null) return null;

        List<PedidoDto> pedidos = cliente.getPedidos() == null
                ? List.of()
                : cliente.getPedidos().stream().map(ClienteMapper::toPedidoDto).toList();

        return new ClienteDto(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone(),
                pedidos
        );
    }

    private static PedidoDto toPedidoDto(Pedido pedido) {
        if (pedido == null) return null;

        return new PedidoDto(
                pedido.getId(),
                pedido.getDataAtual(),
                pedido.getStatusDoPedido()
        );
    }

    // Exemplo de volta (DTO -> Entity) p/ create/update
    // (normalmente você NÃO seta pedidos direto aqui)
    public static Cliente toEntity(ClienteDto dto) {
        if (dto == null) return null;

        Cliente cliente = new Cliente();
        cliente.setId(dto.id());
        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());
        return cliente;
    }
}
