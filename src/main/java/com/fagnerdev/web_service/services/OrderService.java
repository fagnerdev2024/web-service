package com.fagnerdev.web_service.services;

import com.fagnerdev.web_service.entities.Order;
import com.fagnerdev.web_service.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {


    private final OrderRepository orderRepository;

    public OrderService(OrderRepository repository) {
        this.orderRepository = repository;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = orderRepository.findById(id);
        return obj.get();
    }
}
