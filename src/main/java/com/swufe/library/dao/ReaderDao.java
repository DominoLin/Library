package com.swufe.library.dao;

import com.swufe.library.pojo.Reader;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface ReaderDao {
    @Select("select * from reader where account = #{account} and password = #{password}")
    Reader getReader(int account, String password);

    @Insert("insert into reader(account,telephone,username,password) values(#{account},#{telephone},#{username},#{password})")
    void addReader(int account, String telephone, String username, String password);

    @Update("update reader set password = #{password} where account = #{account} and telephone = #{telephone}")
    void resetPwd(int account, String telephone, String password);

}
