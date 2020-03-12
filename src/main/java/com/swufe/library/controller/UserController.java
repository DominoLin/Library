package com.swufe.library.controller;


import com.swufe.library.pojo.User;
import com.swufe.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }
    @PostMapping("/login")
    public String dologin(@RequestParam("id") int id, @RequestParam("password") String password, Model model){
        User user = userService.getUser(id,password);
        if (user!=null){
            System.out.println(user.getUsername());
            model.addAttribute("user", user);
            return "index";
        }else {
            System.out.println("未找到对象");
            return "login";
        }
    }
    
}