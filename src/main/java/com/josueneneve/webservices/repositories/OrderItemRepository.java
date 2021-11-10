package com.josueneneve.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueneneve.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
