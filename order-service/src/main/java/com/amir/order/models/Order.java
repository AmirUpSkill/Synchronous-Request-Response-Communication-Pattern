package com.amir.order.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long  orderId;
    private Long productId;
    private int quantity;
    private String status;
    
}