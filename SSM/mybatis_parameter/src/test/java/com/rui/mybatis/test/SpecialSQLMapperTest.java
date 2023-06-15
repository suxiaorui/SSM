package com.rui.mybatis.test;

import com.rui.mybatis.mapper.SpecialSQLMapper;
import com.rui.mybatis.pojo.User;
import com.rui.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/22 18:46
 * @Version 1.0
 */
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void testDeletreMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("3,5");

    }

    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("user");
        list.forEach(System.out::println);

    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"小张",22,"333");
        mapper.insertUser(user);
    }
}