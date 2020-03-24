package com.swufe.library.dao;

import com.swufe.library.pojo.Lend;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;


@Mapper
@Component
public interface LendDao {

    @Select("select * from lend_list where account = #{account}")
    List<Lend> queryLendById(int account);

    @Insert("insert into lend_list(account,book_id,book_name,lend_date) values (#{account},#{book_id},#{book_name},#{lend_date}) ")
    int addLend(int account, int book_id, String book_name, String lend_date);

    @Update("update lend_list set back_date = #{back_date} where lend_id = #{lend_id}")
    int updateLend(int lend_id, String back_date);

}
