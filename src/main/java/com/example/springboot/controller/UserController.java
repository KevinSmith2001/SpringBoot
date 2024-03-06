package com.example.springboot.controller;

import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    //@Autowired
    //private UserService userService;
    @RequestMapping("/")
    //@ResponseBody
    public String getUser() {
        //User user = userService.getUser();
        return "index";

    }

    @RequestMapping("/666")
    //@ResponseBody
    public String e() {
        //User user = userService.getUser();
        return "customerList";

    }
}
