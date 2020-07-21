package com.example.sp04orderservice.service;

import com.tedu.jtmall.pojo.Order;
import com.tedu.jtmall.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    /**
     * 根据订单id获取订单信息
     * @param orderId
     * @return
     */
    @Override
    public Order getOrder(String orderId) {
        Order order =new Order();
        order.setId(orderId);
        return order;
    }

    /**
     * 添加订单
     * @param order
     */
    @Override
    public void addOrder(Order order) {
        log.info("添加订单.....");
    }
}
