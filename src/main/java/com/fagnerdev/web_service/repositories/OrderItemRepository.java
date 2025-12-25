package com.fagnerdev.web_service.repositories;

import com.fagnerdev.web_service.entities.ItemPedido;
import com.fagnerdev.web_service.entities.pk.ItemPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {

}
