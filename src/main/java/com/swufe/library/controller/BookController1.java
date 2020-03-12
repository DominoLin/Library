package com.swufe.library.controller;

import com.swufe.library.pojo.Book;
import com.swufe.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/book")
public class BookController1 {
    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    public String list(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
}

