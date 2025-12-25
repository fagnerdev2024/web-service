package com.fagnerdev.web_service.entities;

import com.fagnerdev.web_service.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant dataAtual;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private Integer statusDoPedido;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> itensDePedido = new HashSet<>();

    /*@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;*/


    public Pedido() {
    }


    public Pedido(Long id, Instant dataAtual, OrderStatus statusDoPedido, Cliente cliente) {
        super();
        this.id = id;
        this.dataAtual = dataAtual;
        this.cliente = cliente;
        setStatusDoPedido(statusDoPedido);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Instant dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrderStatus getStatusDoPedido() {
        return OrderStatus.valueOf(statusDoPedido);
    }

    public void setStatusDoPedido(OrderStatus statusDoPedido) {
        if (statusDoPedido != null) {
            this.statusDoPedido = statusDoPedido.getCode();
        }
    }

    public Set<ItemPedido> getItensDePedido() {
        return itensDePedido;
    }
}
