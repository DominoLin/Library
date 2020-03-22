package com.swufe.library.service;

import com.swufe.library.dao.ReaderInfoDao;
import com.swufe.library.pojo.ReaderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderInfoServiceImpl implements ReaderInfoService {
    @Autowired
    ReaderInfoDao readerInfoDao;

    @Override
    public ReaderInfo getInfo(int account) {
        return readerInfoDao.getInfo(account);

    }
}
