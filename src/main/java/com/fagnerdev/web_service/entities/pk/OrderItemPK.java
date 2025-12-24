package com.fagnerdev.web_service.entities.pk;

import com.fagnerdev.web_service.entities.Order;
import com.fagnerdev.web_service.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class OrderItemPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((order == null || order.getId() == null) ? 0 : order.getId().hashCode());
        result = prime * result + ((product == null || product.getId() == null) ? 0 : product.getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof OrderItemPK)) return false;
        OrderItemPK other = (OrderItemPK) obj;

        if (order == null || order.getId() == null) {
            if (other.order != null && other.order.getId() != null) return false;
        } else if (!order.getId().equals(other.order.getId())) {
            return false;
        }

        if (product == null || product.getId() == null) {
            if (other.product != null && other.product.getId() != null) return false;
        } else if (!product.getId().equals(other.product.getId())) {
            return false;
        }

        return true;
    }
}
