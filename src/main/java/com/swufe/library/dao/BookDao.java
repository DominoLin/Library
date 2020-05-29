package com.swufe.library.dao;

import com.swufe.library.pojo.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookDao {

    @Insert("insert into book(name,author,publish,pub_date,ISBN,introduction,language,price,class_id,number,num,position) " +
            "values(#{name},#{author},#{publish},#{pub_date},#{ISBN},#{introduction},#{language},#{price},#{class_id},#{number},#{number},#{position})")
    int addBook(Book book);

    @Select("select * from book where book_id = #{id}")
    Book queryBookById(int id);


    @Delete("delete from book where book_id = #{id}")
    int deleteBookById(int id);

    @Update("update book set name=#{name}, author=#{author}, publish=#{publish}, ISBN=#{ISBN}, introduction=#{introduction}, language=#{language}, price=#{price}, class_id=#{class_id},number=#{number},position=#{position} where book_id=#{book_id}")
    int updateBookById(Book book);


    @Select("select * from book")
    List<Book> queryAllBook();

    @Select("select * from book where name like '%${bookName}%'")
    List<Book> queryByName(String bookName);



}
