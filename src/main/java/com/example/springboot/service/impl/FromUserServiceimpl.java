package com.example.springboot.service.impl;

import com.example.springboot.bean.FormUser;
import com.example.springboot.service.FormUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service

public class FromUserServiceimpl implements FormUserService {
    private static ArrayList<FormUser> users = new ArrayList<FormUser>();
    @Override
    public void addUser(FormUser u){
        users.add(u);

    }
    @Override
    public ArrayList<FormUser> getUsers(){
        return users;
    }


}
