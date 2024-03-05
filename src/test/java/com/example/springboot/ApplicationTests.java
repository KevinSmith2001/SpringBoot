package com.example.springboot;

import com.example.springboot.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserController userController;

    @Test
    public void getUser(){
        String user = userController.getUser();
        System.out.println(user);
    }

}
