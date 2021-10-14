package com.josueneneve.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josueneneve.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
