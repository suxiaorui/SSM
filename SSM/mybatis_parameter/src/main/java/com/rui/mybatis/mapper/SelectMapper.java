package com.rui.mybatis.mapper;

import com.rui.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.net.InetAddress;
import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 12:57
 * @Version 1.0
 */
public interface SelectMapper {

    //查询指定的id的用户的信息
    User getUserById(@Param("id") Integer id);

    //查询所有的用户信息
    List<User> getAllUser();

    //查询用户的总数
    Integer getCount();

}
