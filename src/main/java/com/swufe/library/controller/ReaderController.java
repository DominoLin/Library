package com.swufe.library.controller;

import com.swufe.library.pojo.Reader;
import com.swufe.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @RequestMapping("/allReaders")
    public String toAllReader(Model model){
        List<Reader> list = readerService.getAllReaders();
        model.addAttribute("list",list);
        return "allReaders";
    }
    @GetMapping("/addReader")
    public String toAddReader(){
        return "addReader";
    }

    @PostMapping("/addReader")
    public String addReader(int account, String telephone, String username, String password, String college, String major){
        readerService.addReader(account,telephone,username,"123456",college,major);
        return "redirect:/reader/allReaders";
    }
}
