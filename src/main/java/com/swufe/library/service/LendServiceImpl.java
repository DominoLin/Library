package com.swufe.library.service;

import com.swufe.library.dao.LendDao;
import com.swufe.library.pojo.Lend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class LendServiceImpl implements LendService {


    @Autowired
    LendDao lendDao;


    public List<Lend> queryLendById(int account) {
        return lendDao.queryLendById(account);
    }


    public int addLend(int account, int book_id, String book_name) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String lend_date = simpleDateFormat.format(date);
        lendDao.addLend(account,book_id, book_name,lend_date);
        return 1;
    }

    @Override
    public int updateLend(int lend_id) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String back_date = simpleDateFormat.format(date);
        lendDao.updateLend(lend_id,back_date);
        return 1;
    }

    @Override
    public List<Lend> getAllLend() {
        return lendDao.queryAllLend();
    }


}
