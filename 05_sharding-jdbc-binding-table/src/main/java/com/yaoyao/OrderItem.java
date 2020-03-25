package com.yaoyao;

import java.math.BigDecimal;

/**
 * ClassName: OrderItem
 * Description:
 * Date: 2020年03月25日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
public class OrderItem {

    private long orderId;

    private BigDecimal price;

    private long userId;

    private String status;

    private String goodsId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}