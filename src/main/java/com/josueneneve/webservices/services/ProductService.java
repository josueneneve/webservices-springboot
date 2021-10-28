package com.josueneneve.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josueneneve.webservices.entities.Product;
import com.josueneneve.webservices.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj  = repository.findById(id);
		return obj.get();
	}
}
