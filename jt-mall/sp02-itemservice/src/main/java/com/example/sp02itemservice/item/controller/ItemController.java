package com.example.sp02itemservice.item.controller;

import com.tedu.jtmall.pojo.Item;
import com.tedu.jtmall.service.ItemService;
import com.tedu.jtmall.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j

public class ItemController {
    @Autowired
    ItemService itemService;

    @Value("${server.port}")
    private int port;

    //获取地址值中的orderId，根据id获取所有的商品信息，并返回
    @GetMapping("/getItem/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId){
        log.info("server.port = "+port+",orderId = "+orderId);
        List<Item> items = itemService.getItems(orderId);

        return JsonResult.ok(items).msg("port = "+port);

    }
    //删除商品信息
    @PostMapping("/decreaseNumber")
    public  JsonResult decreaseNumber(@RequestBody List<Item> items){
        System.out.println(items);
        itemService.decreaseNumbers(items);
        return JsonResult.ok();
    }

}
