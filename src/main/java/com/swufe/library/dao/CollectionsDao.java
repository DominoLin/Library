package com.swufe.library.dao;

import com.swufe.library.pojo.Book;
import com.swufe.library.pojo.Collections;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component

public interface CollectionsDao {


    @Select("select * from book where book_id in (select book_id from collection where account = #{account})")
    List<Book> queryByAccount(int account);

    @Delete("delete from collection where account = #{account} and book_id = #{book_id}")
    int deleteById(int account, int book_id);

    @Insert("insert into collection(account,book_id) values(#{account}, #{book_id})")
    int addCollection(int account, int book_id);
}
