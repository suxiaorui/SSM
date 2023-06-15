package com.rui.spring.service.impl;

import com.rui.spring.dao.UserDao;
import com.rui.spring.service.UserService;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 20:13
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
