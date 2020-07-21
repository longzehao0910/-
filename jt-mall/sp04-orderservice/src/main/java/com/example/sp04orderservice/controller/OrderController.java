package com.example.sp04orderservice.controller;

import com.tedu.jtmall.pojo.Order;
import com.tedu.jtmall.service.OrderService;
import com.tedu.jtmall.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 两个功能：
 *          1.根据id获取订单信息
 *          2.增加订单
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 获取订单信息
     */
    @GetMapping("/{order}")
    public JsonResult<Order> getOrder(String order){
        orderService.getOrder(order);
        return JsonResult.ok();
    }
}
