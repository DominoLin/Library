package com.swufe.library.controller;

import com.swufe.library.pojo.Reader;
import com.swufe.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerApi {
    @Autowired
    private ReaderService readerService;

    @RequestMapping("/api")
    public Reader getUser(int account, String password){
        System.out.println(account+","+password);
        Reader reader = readerService.getReader(account,password);
        if(reader != null){
            return reader;
        }else {
            System.out.println("未查找到该用户");
            return null;
        }
    }

    @RequestMapping("/register")
    public String addUser(int account, String username, String password,String telephone){
        System.out.println("account:"+account+", username:"+username+", password:"+password);
        readerService.addReader(account,username,password,telephone);
        return "\"status:Success!\"";
    }
}
