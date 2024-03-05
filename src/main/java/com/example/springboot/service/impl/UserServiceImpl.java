package com.example.springboot.service.impl;

import com.example.springboot.bean.User;
import com.example.springboot.dao.UserDao;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(){
        User user = userDao.getUser();
        return user;
    }
}
