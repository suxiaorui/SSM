package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 9:20
 * @Version 1.0
 */
public interface UserMapper {

    User getUserByUsername(String username);

    //验证登录
    //MyBatis就会把参数存储到Map中，存储的方式有两种：
    // “(a)、以arg0、arg1...为键，以传入的参数为值；
    // (b)、以param1、param2...为键，以传入的参数为值；”
    User checkLogin(String username, String password);

    //验证登录(通过map实现)
    User checkLoginByMap(Map<String, Object> map);


    //添加用户信息功能
    void insertUser(User user);

    //若接口中需要传入多个参数时，有两种实现方式：
    // 1.直接向接口传入参数，MyBatis会将参数以Map的方式进行存储，并且key为底层设计好的，value为传入的参数；
    // 2.自己设一个map，直接向接口传入map；

    //验证登录(注解)
    //这种方式，仍然是用Map进行存储，只是这个时候是以“注解”为键，参数为值
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);


    void updateUser();

    void deleteUser();

    User getUserById();

    List<User> getAllUser();
}
