package com.swufe.library.controller;

import com.swufe.library.pojo.User;
import com.swufe.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerApi {
    @Autowired
    private UserService userService;

    @RequestMapping("/api")
    public User getUser(int account, String password){
        System.out.println(account+","+password);
        User user = userService.getUser(account,password);
        if(user != null){
            return user;
        }else {
            System.out.println("未查找到该用户");
            return null;
        }
    }

    @RequestMapping("/register")
    public String addUser(int account, String username, String password){
        System.out.println("account:"+account+", username:"+username+", password:"+password);
        userService.addUser(account,username,password);
        return "Success!";
    }
}
