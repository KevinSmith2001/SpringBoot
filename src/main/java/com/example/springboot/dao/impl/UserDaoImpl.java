package com.example.springboot.dao.impl;

import com.example.springboot.bean.User;
import com.example.springboot.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(12);
        return user;
    }
}
