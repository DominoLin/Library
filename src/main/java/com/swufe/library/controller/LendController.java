package com.swufe.library.controller;

import com.swufe.library.pojo.Lend;
import com.swufe.library.service.LendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/lend")
public class LendController {
    @Autowired
    private LendService lendService;
    @RequestMapping("/allLend")
    public String toAllLend(Model model){
        List<Lend> list = lendService.getAllLend();
        model.addAttribute("list",list);
        return "allLend";
    }


}
