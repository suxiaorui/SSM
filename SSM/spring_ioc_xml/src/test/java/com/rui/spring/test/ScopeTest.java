package com.rui.spring.test;

import com.rui.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 15:09
 * @Version 1.0
 */
public class ScopeTest {

    @Test
    public void testScope(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
        Student student1 = ioc.getBean(Student.class);
        Student student2 = ioc.getBean(Student.class);
        System.out.println(student1==student2);

    }
}
