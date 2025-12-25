package com.fagnerdev.web_service.repositories;

import com.fagnerdev.web_service.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosRepository extends JpaRepository<Pedido, Long> {

}
