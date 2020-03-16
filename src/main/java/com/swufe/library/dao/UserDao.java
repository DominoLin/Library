package com.swufe.library.dao;

import com.swufe.library.pojo.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface UserDao {
    @Select("select * from user where account = #{account} and password = #{password}")
    User getUser(int account, String password);

    @Insert("insert into user(account,username,password) values(#{account},#{username},#{password})")
    void addUser(int account, String username, String password);
}
