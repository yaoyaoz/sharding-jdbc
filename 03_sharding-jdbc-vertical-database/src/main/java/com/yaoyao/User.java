package com.yaoyao;

import java.math.BigDecimal;

/**
 * @Description:
 * @author: yaoyao
 * @date 2020-03-24
 */
public class User {

    private long userId;

    private String userName;

    private String status;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}