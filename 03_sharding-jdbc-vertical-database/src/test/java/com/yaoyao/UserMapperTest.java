package com.yaoyao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * ClassName: UserMapperTest
 * Description:
 * Date: 2020年03月24日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertUser() {
        User user = new User();
        user.setUserId(2L);
        user.setUserName("用户1");
        user.setStatus("1");
        int count = userMapper.insertUser(user);
        System.out.println("count:" + count);
    }

    @Test
    public void testInsertUser2() {
        User user = new User();
        user.setUserId(2L);
        user.setUserName("用户2");
        user.setStatus("1");
        int count = userMapper.insertUser2(user);
        System.out.println("count:" + count);
    }

}