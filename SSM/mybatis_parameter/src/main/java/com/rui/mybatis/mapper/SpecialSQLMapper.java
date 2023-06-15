package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 18:36
 * @Version 1.0
 */
public interface SpecialSQLMapper {

    // 通过用户名模糊查询信息
    List<User> getUserByLike(@Param("mohu") String mohu);


    //批量删除功能
    void deleteMoreUser(@Param("ids") String ids);

    //动态设置表名 查询用户信息
    List<User> getUserList(@Param("tableName") String tableName);

    //添加用户信息 并获取自增的主键
    void insertUser(User user);


}
