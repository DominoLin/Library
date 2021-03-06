package com.swufe.library.service;

import com.swufe.library.dao.ReaderDao;
import com.swufe.library.pojo.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderDao readerDao;

    @Override
    public Reader login(int account, String password) {

        return readerDao.getReader(account,password);
    }

    @Override
    public int register(int account, String telephone, String username, String password, String college, String major) {
        readerDao.addReader(account,telephone,username,password,college,major);
        return 1;
    }


    @Override
    public int resetPwd(int account, String telephone, String password) {
        if(readerDao.check(account,telephone)!=null){
            readerDao.resetPwd(account,telephone,password);
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public Reader getReaderInfo(int account) {
        Reader reader = readerDao.queryByAccount(account);
        if(reader!=null){
            return reader;
        }else {
            return null;
        }
    }

    @Override
    public List<Reader> getAllReaders() {
        return readerDao.queryAllReaders();
    }

    @Override
    public int addReader(int account, String telephone, String username, String password, String college, String major) {
        return readerDao.addReader(account,telephone,username,"123456",college,major);
    }

    @Override
    public int deleteById(int account) {
        return readerDao.deleteReaderById(account);
    }

    @Override
    public int updateById(Reader reader) {
        return readerDao.updateById(reader);
    }


}
