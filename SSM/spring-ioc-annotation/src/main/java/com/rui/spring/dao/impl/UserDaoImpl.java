package com.rui.spring.dao.impl;

import com.rui.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.swing.*;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/25 10:25
 * @Version 1.0
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
