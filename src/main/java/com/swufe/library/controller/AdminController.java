package com.swufe.library.controller;

import com.swufe.library.pojo.Admin;
import com.swufe.library.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(int admin_id, String password){
        Admin admin = adminService.getAdmin(admin_id,password);
        if(admin!=null){
            return "index";
        }else {
            return "login";
        }
    }

    @GetMapping("/forget")
    public String forget(){
        return "forget";
    }

    @PostMapping("/forget")
    public String forget(String telephone, int admin_id, String pwd, String pwdC){
        int i = adminService.resetPwd(telephone,admin_id,pwd,pwdC);
        if(i!=0){
            return "login";
        }else {
            return "forget";
        }

    }
}
