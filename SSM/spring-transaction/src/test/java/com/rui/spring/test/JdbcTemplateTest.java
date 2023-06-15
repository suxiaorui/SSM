package com.rui.spring.test;

import com.rui.spring.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 21:02
 * @Version 1.0
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert(){
        String sql = "insert into user values(null,?,?,?)";
        jdbcTemplate.update(sql,"root","20","111");
    }

    @Test
    public void testGetUserById(){
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);
    }


    @Test
    public void testGetUserAll(){
        String sql = "select * from user";
        List<User> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(User.class));
        list.forEach(System.out::println);
    }


    @Test
    public void testGetCount(){
        String sql = "select count(*) from user";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        System.out.println(count);
    }
}
