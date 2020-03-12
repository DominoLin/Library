package com.swufe.library.service;

import com.swufe.library.pojo.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);

    int deleteBookById(int id);

    int updateBook(Book book);

    Book queryBookById(int id);

    List<Book> queryAllBook();
}
