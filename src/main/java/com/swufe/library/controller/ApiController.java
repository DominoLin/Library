package com.swufe.library.controller;


import com.swufe.library.pojo.*;
import com.swufe.library.service.BookService;
import com.swufe.library.service.LendService;
import com.swufe.library.service.ReaderInfoService;
import com.swufe.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ReaderService readerService;

    @Autowired
    private BookService bookService;

    @Autowired
    private ReaderInfoService readerInfoService;

    @Autowired
    private LendService lendService;


    //登录
    @RequestMapping("/login")
    public Result login(int account, String password){
        Result<Reader> result = new Result<>();
        Reader reader = readerService.getReader(account,password);
        if(reader != null){
            result.setCode(200);
            result.setMessage("登录成功");
            result.setData(reader);
        }else {
            result.setCode(0);
            result.setMessage("用户名或密码错误");
        }
        return result;
    }

//    注册
    @RequestMapping("/register")
    public Result register(int account, String telephone, String username, String password){
        Result<Reader> result = new Result<>();
        int i = readerService.addReader(account,telephone,username,password);
        if(i == 1){
            result.setCode(200);
            result.setMessage("注册成功");
        }else {
            result.setCode(0);
            result.setMessage("注册失败，请重试");
        }
        return result;
    }

    //找回密码（根据学号、手机号匹配修改密码）
    @RequestMapping("/findPwd")
    public Result findPwd(int account,String telephone, String password){
        Result<Reader> result = new Result<>();
        int i = readerService.resetPwd(account, telephone, password);
        if(i == 1){
            result.setCode(200);
            result.setMessage("密码修改成功");
        }else{
            result.setCode(0);
            result.setMessage("学号与电话号码不匹配");
        }
        return result;
    }

    //获得用户信息（根据account）
    @RequestMapping("userInfo")
    public Result userInfo(int account){
        Result<ReaderInfo> result = new Result();
        ReaderInfo readerInfo = readerInfoService.getInfo(account);
        if(readerInfo == null){
            result.setCode(0);
            result.setMessage("查找失败");
        }else {
            result.setCode(200);
            result.setMessage("查找成功");
            result.setData(readerInfo);
        }
        return result;
    }


    //所有图书
    @RequestMapping("/allBook")
    public List<Book> allBook(){
        List<Book> books  = bookService.queryAllBook();
        return books;
    }

    //根据用户查找借阅记录
    @RequestMapping("/allLend")
    public Result addLend(int account){
        Result<List<Lend>> result = new Result<>();
        List<Lend> lendList = lendService.queryLendById(account);

        if(!lendList.isEmpty()){
            result.setCode(200);
            result.setMessage("查找成功");
            result.setData(lendList);
        }else {
            result.setCode(0);
            result.setMessage("查找失败");
        }
        return result;
    }

    @RequestMapping("/addLend")
    public Result addLend(int account, int book_id, String book_name){
        Result<Lend> result = new Result<>();
        int i = lendService.addLend(account,book_id,book_name);
        if(i == 1){
            result.setCode(200);
            result.setMessage("借阅成功");
        }else {
            result.setCode(0);
            result.setMessage("借阅失败");
        }
        return result;
    }

    @RequestMapping("/updateLend")
    public Result updateLend(int account, int book_id){
        Result<List<Lend>> result = new Result<>();
        int i = lendService.updateLend(account,book_id);
        if(i == 1){
            result.setCode(200);
            result.setMessage("还书成功");
        }else {
            result.setCode(0);
            result.setMessage("还书失败");
        }
        return result;
    }

    @RequestMapping("/search")
    public  Result search(String bookName){
        Result<List<Book>> result = new Result<>();
        List<Book> books = new ArrayList<>();
        books = bookService.queryBookByName(bookName);
        if(!books.isEmpty()){
            result.setCode(200);
            result.setMessage("查找成功");
            result.setData(books);
        }else {
            result.setCode(0);
            result.setMessage("查找失败");
//            result.setData(books);
        }
        return result;

    }
}
