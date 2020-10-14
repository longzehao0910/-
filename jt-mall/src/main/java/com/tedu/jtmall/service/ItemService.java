package com.tedu.jtmall.service;

import com.tedu.jtmall.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String oderId);

    void decreaseNumbers(List<Item> list);

}
