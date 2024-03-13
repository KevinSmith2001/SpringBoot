package com.example.springboot.controller;

import com.example.springboot.bean.FormUser;
import com.example.springboot.service.FormUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/form")
public class FormUserController {
    @Autowired
    private FormUserService formUserService;
    @RequestMapping("/input")
    public String inputUser(Model model) {
        HashMap<String, String> hobbys = new HashMap<String, String>();
        hobbys.put("篮球", "篮球");
        hobbys.put("乒乓球", "乒乓球");
        hobbys.put("电玩", "电玩");
        hobbys.put("游泳", "游泳");
        model.addAttribute("hobbys", hobbys);
        model.addAttribute("carrers",
                new String[]{
                        "Teacher","Student","coding搬运工","IT民工","Others"});
        model.addAttribute("houseRegisters",
                 new String[]{"Beijing","Shanghai","Guangzhou","Shenzhen","Others"});
        return "userAdd";
    }
    @RequestMapping("/list")
    public String listUsers(FormUser user,Model model){
        formUserService.addUser(user);
        List<FormUser> users = formUserService.getUsers();
        model.addAttribute("users",users);
        return "userList";
    }
}