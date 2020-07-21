package com.tedu.jtmall.service;

import com.tedu.jtmall.pojo.User;

public interface  UserService {
    User getUser(Integer id);
    void addScore(Integer id,Integer score);
}
