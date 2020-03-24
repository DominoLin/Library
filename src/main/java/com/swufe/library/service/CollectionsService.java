package com.swufe.library.service;


import com.swufe.library.pojo.Book;
import com.swufe.library.pojo.Collections;


import java.util.List;

public interface CollectionsService {

    List<Book> queryByAccount(int account);

    int DeleteById(int account, int book_id);

    int addCollection(int account,int book_id);
}
