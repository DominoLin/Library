package com.swufe.library.service;

import com.swufe.library.dao.ReaderDao;
import com.swufe.library.pojo.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderDao readerDao;

    @Override
    public Reader getReader(int account, String password) {
        return readerDao.getReader(account,password);
    }

    @Override
    public int addReader(int account, String telephone, String username, String password) {
        readerDao.addReader(account,telephone,username,password);
        return 1;
    }

    @Override
    public int resetPwd(int account, String telephone, String password) {
        readerDao.resetPwd(account,telephone,password);
        return 1;
    }


}
