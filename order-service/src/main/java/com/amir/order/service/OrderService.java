package com.amir.order.service;

import org.springframework.stereotype.Service;

import com.amir.order.config.InventoryClient;
import com.amir.order.models.Order;

@Service
public class OrderService {

    private InventoryClient inventoryClient;

    public Order placeOrder(Long productId , int quantity){
        boolean  available = inventoryClient.checkAvailability(productId , quantity);
        Order order = new Order();
        order.setProductId(productId);
        order.setQuantity(quantity);
        order.setStatus(available ? "Confirmed" : "Rejected");
        return order;
    }
    
}
