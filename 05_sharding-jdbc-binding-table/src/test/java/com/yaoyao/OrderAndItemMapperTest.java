package com.yaoyao;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: OrderAndItemMapperTest
 * Description:
 * Date: 2020年03月25日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderAndItemMapperTest {

    @Autowired
    private OrderAndItemMapper orderAndItemMapper;

    @Test
    public void testInsertOrder() {
        for (int i = 1; i < 4; i++) {
            Order order = new Order();
            order.setOrderId(i);
            order.setPrice(new BigDecimal(20));
            order.setStatus("success");
            order.setUserId(1L);
            int count = orderAndItemMapper.insertOrder(order);
            System.out.println("count:" + count);
        }
    }

    @Test
    public void test() {
        for (int i = 1; i < 4; i++) {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderId(i);
            orderItem.setPrice(new BigDecimal(20));
            orderItem.setStatus("success");
            orderItem.setUserId(1L);
            orderItem.setGoodsId("goodsId");
            int count = orderAndItemMapper.insertOrderItem(orderItem);
            System.out.println("count:" + count);
        }
    }

    /**
     * 两张分表的表联合查询，再跟上分表的字段来查，会报错。
     */
    @Test
    public void testQueryOrderAndItem() {
        String orderId = "1";
        List<OrderItem> orderItems = orderAndItemMapper.queryOrderAndItem(orderId);
        System.out.println("orderItems:" + JSONObject.toJSON(orderItems));
    }

}