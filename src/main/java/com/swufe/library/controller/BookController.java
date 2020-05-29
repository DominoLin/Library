package com.swufe.library.controller;

import com.swufe.library.pojo.Book;
import com.swufe.library.pojo.ClassInfo;
import com.swufe.library.service.BookService;
import com.swufe.library.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ClassInfoService classInfoService;

    

    //显示所有书籍
    @RequestMapping("/all")
    public String Book(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBooks";
    }

    //跳转到添加书籍页面，获取书籍类别列表
    @GetMapping("/addBook")
    public String toAddBook(Model model){
        List<ClassInfo> typeList = classInfoService.queryAllClass();
        model.addAttribute("typeList",typeList);

        return "addBook";
    }

    //添加书籍，并重定向到所有书籍列表
    @PostMapping("/addBook")
    public String addBook(Book book, MultipartFile file){
        try {
            bookService.addBook(book,file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/book/all";
    }


    @RequestMapping("/test")
    public String Test(Model model){
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
//修改书籍信息
    @GetMapping("/editBook")
    public String toEditBook(int book_id, Model model){

        List<ClassInfo> typeList = classInfoService.queryAllClass();
        model.addAttribute("typeList",typeList);

        Book book = bookService.queryBookById(book_id);
        model.addAttribute("book",book);
        return "editBook";
    }

    @PostMapping("/editBook")
    public String editBook(Book book){
        bookService.updateBookById(book);
        return "redirect:/book/all";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(int book_id){
        bookService.deleteBookById(book_id);
        return "redirect:/book/all";
    }


}
