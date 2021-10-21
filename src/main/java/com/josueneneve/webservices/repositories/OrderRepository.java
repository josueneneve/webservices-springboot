package com.josueneneve.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueneneve.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
