package com.example.springboot.controller;

import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    protected String userList(Model model){
        User c1 = new User();
        c1.setId(1);
        c1.setName("li");
        c1.setAge(18);
        model.addAttribute("customer",c1);
        return "customerList";
    }
}
