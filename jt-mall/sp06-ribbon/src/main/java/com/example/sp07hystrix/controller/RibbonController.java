package com.example.sp07hystrix.controller;

import com.tedu.jtmall.pojo.Item;
import com.tedu.jtmall.web.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RibbonController {

    //第一步，ribbon负载均衡注入所需依赖
    @Autowired
    private RestTemplate rt;

    //编写具体功能代码
    //编写路径：你要的功能路径
    @GetMapping("/item-service/getItem/{orderId}")
    public JsonResult<List<Item>> getItems(@PathVariable String orderId) {
        //这里服务器路径用service-id 代替，ribbon 会向服务的多台集群服务器分发请求
        return rt.getForObject("http://item-service/getItem/{1}", JsonResult.class, orderId);
    }

    //删除商品信息
    //具体的访问路径根据之前item中的方法如何写的再定义
    @PostMapping("/item-service/decreaseNumber")
    public JsonResult decreaseNumber(@RequestBody List<Item> items) {
        //发送post请求
        System.out.println("ribbonController");
        return rt.postForObject("http://item-service/decreaseNumber", items, JsonResult.class);
    }
}
