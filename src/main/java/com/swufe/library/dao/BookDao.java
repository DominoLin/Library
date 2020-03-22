package com.swufe.library.dao;

import com.swufe.library.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookDao {

    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);

    Book queryBookById(int id);

    @Select("select * from book")
    List<Book> queryAllBook();

    @Select("select * from book where name like '%${bookName}%'")

    List<Book> queryByName(String bookName);

}
