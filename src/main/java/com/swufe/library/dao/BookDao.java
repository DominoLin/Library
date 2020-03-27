package com.swufe.library.dao;

import com.swufe.library.pojo.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookDao {

    @Insert("insert into book(name,author,publish,ISBN,introduction,language,price,class_id,number,position) values(#{name},#{author},#{publish},#{ISBN},#{introduction},#{language},#{price},#{class_id},#{number},#{position})")
    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);


    @Select("select * from book")
    List<Book> queryAllBook();

    @Select("select * from book where name like '%${bookName}%'")
    List<Book> queryByName(String bookName);



}
