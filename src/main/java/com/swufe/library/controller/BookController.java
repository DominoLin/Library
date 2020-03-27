package com.swufe.library.controller;

import com.swufe.library.pojo.Book;
import com.swufe.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    public String Book(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);

        return "allBooks";

    }

    @GetMapping("/addBook")
    public String toAddBook(){
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(Book book){
        bookService.addBook(book);
        return "redirect:/book/all";
    }

    @RequestMapping("/test")
    public String Test(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);

        return "allBook";

    }
}
