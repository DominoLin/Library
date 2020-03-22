package com.swufe.library.service;

import com.swufe.library.pojo.Reader;

public interface ReaderService {
    //用户登录
    Reader getReader(int account, String password);

    //用户注册
    int addReader(int account, String telephone, String username, String password);

    //找回密码
    int resetPwd(int account, String telephone, String password);

    //修改电话号码


}
