package com.yaoyao;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * ClassName: OrderAndItemMapper
 * Description:
 * Date: 2020年03月25日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
@Mapper
public interface OrderAndItemMapper {

    @Insert("insert into t_order (order_id, price, user_id, status) values(#{orderId}, #{price}, #{userId}, #{status})")
    int insertOrder(Order order);

    @Insert("insert into t_order_item (order_id, price, user_id, status, goods_id) " +
            "values(#{orderId}, #{price}, #{userId}, #{status}, #{goodsId})")
    int insertOrderItem(OrderItem order);

    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "goodsId", column = "goods_id")
    })
    @Select("select * from t_order o, t_order_item i where o.order_id=i.order_id and o.order_id=#{orderId}")
    List<OrderItem> queryOrderAndItem(@Param("orderId") String orderId);
}