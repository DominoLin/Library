package com.swufe.library.controller;

import com.swufe.library.pojo.Book;
import com.swufe.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/api")
    public List<Book> Book(){
        List<Book> books = new ArrayList<>();
        books = bookService.queryAllBook();
        return books;

    }
}
