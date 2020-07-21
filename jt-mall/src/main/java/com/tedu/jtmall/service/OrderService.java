package com.tedu.jtmall.service;

import com.tedu.jtmall.pojo.Order;

public interface  OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}
