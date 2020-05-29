package com.swufe.library.service;

import com.swufe.library.dao.BookDao;
import com.swufe.library.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public int addBook(Book book, MultipartFile file) throws IOException {
        String filepath = "C:\\Users\\x6760\\IdeaProjects\\Library\\src\\main\\webapp\\static\\book";

        String originalFilename = file.getOriginalFilename();
        String newFileName = book.getISBN()+".jpg";
        File targetFile = new File(filepath,newFileName);
        file.transferTo(targetFile);
        return bookDao.addBook(book);
    }

    @Override
    public Book queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBookById(Book book) {
        return bookDao.updateBookById(book);
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
