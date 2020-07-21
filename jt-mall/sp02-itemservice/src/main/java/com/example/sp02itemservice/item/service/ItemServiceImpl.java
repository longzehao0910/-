package com.example.sp02itemservice.item.service;

import com.tedu.jtmall.pojo.Item;
import com.tedu.jtmall.service.ItemService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    /**
     * 根据订单ID，获取商品信息
     * @param oderId
     * @return
     */
    @Override
    public List<Item> getItems(String oderId) {
        ArrayList<Item> list = new ArrayList<Item>();
        Collections.addAll(list,new Item(1,"商品",1)
                ,new Item(2,"商品",2),new Item(3,"商品",3),
                new Item(4,"商品",4),new Item(5,"商品",5));
        return list;
    }

    @Override
    public void decreaseNumbers(List<Item> list) {
        for(Item item:list){
            log.info("商品减少");
        }
    }
}
