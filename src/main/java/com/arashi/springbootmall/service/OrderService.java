package com.arashi.springbootmall.service;

import com.arashi.springbootmall.dto.CreateOrderRequest;
import com.arashi.springbootmall.dto.OrderQueryParams;
import com.arashi.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
