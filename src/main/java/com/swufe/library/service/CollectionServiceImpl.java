package com.swufe.library.service;

import com.swufe.library.dao.CollectionsDao;
import com.swufe.library.pojo.Book;
import com.swufe.library.pojo.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CollectionServiceImpl implements CollectionsService{
    @Autowired
    private CollectionsDao collectionsDao;


    @Override
    public List<Book> queryByAccount(int account) {
        return collectionsDao.queryByAccount(account);
    }

    @Override
    public int DeleteById(int account, int book_id) {
        return collectionsDao.deleteById(account,book_id);
    }

    @Override
    public int addCollection(int account, int book_id) {
        return collectionsDao.addCollection(account,book_id);
    }
}
