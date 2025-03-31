package com.arashi.springbootmall.service;

import com.arashi.springbootmall.dto.CreateOrderRequest;
import com.arashi.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
