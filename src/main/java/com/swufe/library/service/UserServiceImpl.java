package com.swufe.library.service;

import com.swufe.library.dao.UserDao;
import com.swufe.library.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    public User getUser(int account, String password) {
        return userDao.getUser(account,password);
    }

    public void addUser(int account, String username, String password){
        userDao.addUser(account, username, password);
    }
}
