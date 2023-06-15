package com.rui.controller;

import com.rui.spring.service.UserService;
import com.rui.spring.service.impl.UserServiceImpl;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 20:12
 * @Version 1.0
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        userService.saveUser();
    }

}
