package com.example.sp03userservice.controller;


import com.tedu.jtmall.pojo.User;
import com.tedu.jtmall.service.UserService;
import com.tedu.jtmall.web.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    //根据id获取用户信息
    @GetMapping("/{userId}")
    public JsonResult<User> getUserById(@PathVariable(name = "userId") Integer id){
        log.info("get user  id = "+id);
        User u = userService.getUser(id);
        return JsonResult.ok(u);
    }

    //根据id给用户增加积分
    /*@GetMapping("/{userId}/score")
    public JsonResult addScore(@PathVariable(name = "userId") Integer id,@RequestParam Integer score){

        userService.addScore(id,score);

        return JsonResult.ok();

    }*/
    @GetMapping("/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score){
        userService.addScore(userId,score);
        return JsonResult.ok();
    }
}
