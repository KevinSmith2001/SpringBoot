package com.example.springboot.controller;

import com.example.springboot.bean.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.ObjectStreamClass;
import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping(value = "/userList")
    protected ModelAndView userList() {

        User c1 = new User();
        c1.setId(1);
        c1.setName("张三");
        c1.setAge(22);

        //Map 提供了一个更通用的元素存储方法。Map 集合类用于存储元素对（称作“键”和“值”），其中每个键映射到一个值。
        // 将键映射到值的对象
        //一个映射不能包含重复的键
        //每个键最多只能映射到一个值 :添加功能 put，删除功能 remove……
        Map<String, Object> model = new HashMap<String, Object>();

        model.put("customer", c1);
        //ModelAndView(String viewName, Map model) 使用Map来收集这些Model对象，然后设定给ModelAndView

        ModelAndView modelAndView = new ModelAndView("customerList", model);
        return modelAndView;
    }
}
