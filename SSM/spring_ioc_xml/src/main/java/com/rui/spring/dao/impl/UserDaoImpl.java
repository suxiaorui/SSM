package com.rui.spring.dao.impl;

import com.rui.spring.dao.UserDao;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 20:15
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
