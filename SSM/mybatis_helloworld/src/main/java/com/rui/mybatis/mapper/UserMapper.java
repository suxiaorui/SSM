package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.User;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/21 16:50
 * @Version 1.0
 */
public interface UserMapper {

    //添加用户信息
    int insertUser();
    //修改用户信息
    void updateUser();
    //删除用户信息
    void deleteUser();
    //查找数据
    User getUserById();
    //查询所有用户信息
    List<User> getAllUser();

}
