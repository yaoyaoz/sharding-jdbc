package com.yaoyao;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yaoyao on 2020-03-22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsertOrder() {
        for (int i = 0; i < 20; i++) {
            Order order = new Order();
            order.setPrice(new BigDecimal(i));
            order.setUserId(1);
            order.setStatus("success");
            int count = orderMapper.insertOrder(order);
            System.out.println("i:" + count);
        }
    }

    @Test
    public void testFindByOrderId() {
        Order order = new Order();
        order.setOrderId(448560015440084993L);
        List<Order> orders = orderMapper.findByOrderId(order);
        System.out.println("orders:" + JSONObject.toJSONString(orders));
    }

    @Test
    public void testFindByOrderIds() {
        List<Long> orderIds = new ArrayList<>();
        orderIds.add(448562055033651200L);
        orderIds.add(5L);
        List<Order> list = orderMapper.findByOrderIds(orderIds);
        System.out.println("list:" + JSONObject.toJSONString(list));
    }
    
    @Test
    public void testFindAll() {
        List<Order> allList = orderMapper.findAll();
        System.out.println("allList:" + JSONObject.toJSONString(allList));
    }

}
