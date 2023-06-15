package com.rui.mybatis.test;

import com.rui.mybatis.mapper.UserMapper;
import com.rui.mybatis.pojo.User;
import com.rui.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 9:26
 * @Version 1.0
 */
public class ParameterTest {

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("小黑");
        System.out.println(user);
    }

    @Test
    //验证登录
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("root", "123");
        System.out.println(user);
    }

    // 通过传入map实现
    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "root");
        map.put("password", "123");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user  = new User(3, "lisi", 18,"222");
        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("root", "123");
        System.out.println(user);
    }
}