package com.controller;

import com.dao.IUserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private IUserDao iUserDao;

    @RequestMapping("getall")
    public String getall(){

        System.out.println("进来了！");

        for (User user : iUserDao.getAllUser()) {

            System.out.println(user.getUname()+","+user.getUpwd());

        }

    return "success";

    }





}
