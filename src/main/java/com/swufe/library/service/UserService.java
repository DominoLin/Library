package com.swufe.library.service;

import com.swufe.library.pojo.User;

public interface UserService {
    User getUser(int id, String password);

}
