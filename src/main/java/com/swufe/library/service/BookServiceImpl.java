package com.swufe.library.service;

import com.swufe.library.dao.BookDao;
import com.swufe.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public int updateBook(Book book) {
        return 0;
    }

    @Override
    public Book queryBookById(int id) {
        return null;
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return bookDao.queryByName(bookName);
    }
}
