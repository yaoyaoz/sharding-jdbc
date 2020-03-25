package com.yaoyao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: DictMapper
 * Description:
 * Date: 2020年03月25日
 *
 * @author yaoyao
 * @version 1.0.0
 * @since 1.8
 */
@Mapper
public interface DictMapper {

    @Insert("insert into t_dict(code, value, msg) values(#{code}, #{value}, #{msg})")
    public int insertDict(Dict dict);

}