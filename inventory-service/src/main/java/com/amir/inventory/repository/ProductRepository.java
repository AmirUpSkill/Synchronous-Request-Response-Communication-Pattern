package com.amir.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amir.inventory.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
