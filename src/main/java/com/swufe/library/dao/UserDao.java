package com.swufe.library.dao;

import com.swufe.library.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id} and password = #{password}")
    User getUser(int id, String password);
}
