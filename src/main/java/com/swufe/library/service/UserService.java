package com.swufe.library.service;

import com.swufe.library.pojo.User;

public interface UserService {
    User getUser(int account, String password);
    void addUser(int account, String username, String password);
}
