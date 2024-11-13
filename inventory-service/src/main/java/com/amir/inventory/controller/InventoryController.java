package com.amir.inventory.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amir.inventory.service.InventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private InventoryService inventoryService;

    public ResponseEntity<Boolean> checkAvailability(
        @RequestParam Long productId,
        @RequestParam int quantity
    ){
        boolean available = inventoryService.isProductInStock(productId, quantity);
        return ResponseEntity.ok(available);}
    
}
