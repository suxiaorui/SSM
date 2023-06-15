package com.rui.controller;

import com.rui.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/25 10:22
 * @Version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }

}
