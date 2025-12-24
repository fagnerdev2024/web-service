package com.fagnerdev.web_service.repositories;

import com.fagnerdev.web_service.entities.OrderItem;
import com.fagnerdev.web_service.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
