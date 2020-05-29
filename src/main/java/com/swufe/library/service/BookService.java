package com.swufe.library.service;

import com.swufe.library.pojo.Book;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface BookService {


    int addBook(Book book, MultipartFile file) throws IOException;

    Book queryBookById(int id);

    int deleteBookById(int id);

    int updateBookById(Book book);



    List<Book> queryAllBook();

    List<Book> queryBookByName(String bookName);
}
