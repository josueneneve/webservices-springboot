package com.josueneneve.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueneneve.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
