package com.rui.spring.service.impl;

import com.rui.spring.dao.UserDao;
import com.rui.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/25 10:23
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
