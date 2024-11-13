package com.amir.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amir.inventory.repository.ProductRepository;

@Service
public class InventoryService {
    @Autowired
    private ProductRepository productRepository;

    public boolean isProductInStock(Long productId , int requestedQuantity){
        return productRepository.findById(productId)
        .map(product -> product.getQuantity() >= requestedQuantity)
        .orElse(false);
    }
    
}
