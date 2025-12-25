package com.fagnerdev.web_service.entities.pk;

import com.fagnerdev.web_service.entities.Pedido;
import com.fagnerdev.web_service.entities.Produto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class ItemPedidoPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pedido == null || pedido.getId() == null) ? 0 : pedido.getId().hashCode());
        result = prime * result + ((produto == null || produto.getId() == null) ? 0 : produto.getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ItemPedidoPK)) return false;
        ItemPedidoPK other = (ItemPedidoPK) obj;

        if (pedido == null || pedido.getId() == null) {
            if (other.pedido != null && other.pedido.getId() != null) return false;
        } else if (!pedido.getId().equals(other.pedido.getId())) {
            return false;
        }

        if (produto == null || produto.getId() == null) {
            if (other.produto != null && other.produto.getId() != null) return false;
        } else if (!produto.getId().equals(other.produto.getId())) {
            return false;
        }

        return true;
    }
}
