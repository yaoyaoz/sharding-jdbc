package com.yaoyao;

import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yaoyao on 2020-03-22.
 */
@Mapper
public interface OrderMapper {

    /**
     * 插入数据
     *
     * @param order
     * @return
     */
    @Insert("insert into t_order (price, user_id, status) values(#{price}, #{userId}, #{status})")
    int insertOrder(Order order);

    /**
     * 根据orderId查询
     *
     * @param order
     * @return
     */
    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id")
    })
    @Select("SELECT * FROM t_order where order_id = #{orderId}") //WHERE order_id = #{orderId}
    List<Order> findByOrderId(Order order);

    /**
     * 根据orderIds查询
     * @param orderIds
     * @return
     */
    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id")
    })
    @Select("<script>" +
            " select * from t_order where order_id in " +
            " <foreach collection='orderIds' open='(' separator=',' close=')' item='orderId'>" +
            " #{orderId}" +
            " </foreach>" +
            " </script>")
    List<Order> findByOrderIds(@Param("orderIds") List<Long> orderIds);

    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id")
    })
    @Select("select * from t_order")
    List<Order> findAll();

    /**
     * 根据orderId和userId查询
     *
     * @param orderId
     * @param userId
     * @return
     */
    @Results({
            @Result(property = "orderId", column = "order_id"),
            @Result(property = "userId", column = "user_id")
    })
    @Select("select * from t_order where order_id = #{orderId} and user_id = #{userId}")
    List<Order> findByOrderIdAndUserId(@Param("orderId") Long orderId, @Param("userId") Long userId);
}
