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

    @Insert("insert into reader(account,telephone,username,password,college,major) values(#{account},#{telephone},#{username},#{password},#{college},#{major})")
    void addReader(int account, String telephone, String username, String password, String college, String major);

    @Update("update reader set password = #{password} where account = #{account} and telephone = #{telephone}")
    void resetPwd(int account, String telephone, String password);

    @Update("update reader set college = #{college}, major= #{major} where account = #{account}")
    void updateReader(int account,  String college, String major);

    @Select("select * from reader where account = #{account} and telephone = #{telephone}")
    Reader check(int account, String telephone);

    @Select("select * from reader where account = #{account}")
    Reader queryByAccount(int account);
}
