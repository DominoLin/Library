package com.swufe.library.controller;


import com.swufe.library.pojo.Reader;
import com.swufe.library.service.ReaderService;
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
    private ReaderService readerService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }
    @PostMapping("/login")
    public String dologin(@RequestParam("account") int account, @RequestParam("password") String password, Model model){
        Reader reader = readerService.login(account,password);
        if (reader !=null){
            System.out.println(reader.getUsername());
            model.addAttribute("user", reader);
            return "/WEB-INF/jsp/index.jsp";
        }else {
            System.out.println("未找到对象");
            return "login";
        }
    }
    
}
