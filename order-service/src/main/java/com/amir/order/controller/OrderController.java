package com.amir.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amir.order.models.Order;
import com.amir.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/place")
    public ResponseEntity<Order> placeOrder(@RequestParam Long productId , @RequestParam int quantity){
        Order order = orderService.placeOrder(productId , quantity);
        return ResponseEntity.ok(order);
    }
    
}
