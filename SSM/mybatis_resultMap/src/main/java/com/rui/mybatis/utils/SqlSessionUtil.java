package com.rui.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/21 18:49
 * @Version 1.0
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        try {
            //获取核心配置文件的输入流
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            //获取建造工厂方法
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取工厂对象
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
            //获取SqlSession对象(设置参数为true,自动提交)
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession;
    }

}
