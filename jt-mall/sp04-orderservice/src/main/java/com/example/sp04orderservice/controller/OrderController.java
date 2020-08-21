package com.example.sp04orderservice.controller;

import com.tedu.jtmall.pojo.Item;
import com.tedu.jtmall.pojo.Order;
import com.tedu.jtmall.pojo.User;
import com.tedu.jtmall.service.OrderService;
import com.tedu.jtmall.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    @GetMapping("/{orderId}")
    public JsonResult<Order> getOrder(@PathVariable String orderId){
        log.info("get order , id = "+orderId);
       Order order =  orderService.getOrder(orderId);
        return JsonResult.ok(order);
    }

    /**
     * 增加订单
     */
    @RequestMapping("/addOrder")
    public JsonResult addOrder(){
        List<Item> items = new ArrayList<Item>();
        Collections.addAll(items,new Item(1,"item1",1),new Item(2,"item2",2));
        User user = new User(1,"张三","123");
        Order order = new Order("1",user,items);

        orderService.addOrder(order);
        return JsonResult.ok();
    }
}
