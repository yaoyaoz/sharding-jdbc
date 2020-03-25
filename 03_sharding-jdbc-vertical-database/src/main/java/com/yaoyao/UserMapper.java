package com.yaoyao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Description:
 * Date: 2020年03月24日
 *
 * @author zhouxinyao
 * @version 1.0.0
 * @since 1.8
 */
@Mapper
public interface UserMapper {

    /**
     * 插入数据
     *
     * @param order
     * @return
     */
    @Insert("insert into t_user (user_id, user_name, status) values(#{userId}, #{userName}, #{status})")
    int insertUser(User order);

    @Insert("insert into t_user_2 (user_id, user_name, status) values(#{userId}, #{userName}, #{status})")
    int insertUser2(User order);

}