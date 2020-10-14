package com.example.sp03userservice.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.tedu.jtmall.pojo.User;
import com.tedu.jtmall.service.UserService;
import com.tedu.jtmall.web.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Value("${sp.user-service.users}")
    private String userJson;


    /**
     * 根据id获取用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User getUser(Integer id) {
        log.info("users json string : " + userJson);
        List<User> userList = JsonUtil.from(userJson, new TypeReference<List<User>>() {
        });
        for (User u : userList) {
            if (u.getId().equals(id)) {
                return u;
            }
        }
        return new User(id, "name-" + id, "pwd-" + id);
    }

    /**
     * 添加积分
     *
     * @param id
     * @param score
     */
    @Override
    public void addScore(Integer id, Integer score) {
        log.info("user " + id + " - 增加积分 " + score);
    }
}
