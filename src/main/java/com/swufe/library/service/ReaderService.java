package com.swufe.library.service;

import com.swufe.library.pojo.Reader;

public interface ReaderService {
    //用户登录
    Reader login(int account, String password);

    //用户注册
    int register(int account, String telephone, String username, String password, String college, String major);

    //重置密码
    int resetPwd(int account, String telephone, String password);

    //修改电话号码

    Reader getReaderInfo(int account);



}
