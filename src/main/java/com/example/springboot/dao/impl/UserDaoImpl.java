package com.example.springboot.dao.impl;

import com.example.springboot.bean.User;
import com.example.springboot.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public User getUser(){
        User user = new User();
        user.setId(2);
        user.setName("石凯林");
        user.setAge(23);
        return user;
    }
}
