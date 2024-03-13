package com.example.springboot.service;

import com.example.springboot.bean.FormUser;

import java.util.ArrayList;

public interface FormUserService {
    void addUser(FormUser u);
    ArrayList<FormUser> getUsers();
}
