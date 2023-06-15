package com.rui.spring.test;

import com.rui.spring.pojo.Clazz;
import com.rui.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 9:35
 * @Version 1.0
 */
public class IOCByXMLTest {

    /*
    * 获取bean的三种方式
    * 1 根据bean的id获取
    * 2 根据bean的类型获取
    * 注意：根据类型获取bean时候，要求IOC容器中有且只有一个类型的bean
    * 3 根据bean的id和类型来获取
    * */

    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
//        Student studentOne = (Student) ioc.getBean("studentOne");
//        Student student = ioc.getBean(Student.class);
        Student student = ioc.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testDI(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student student = ioc.getBean("studentSix", Student.class);
//        Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        System.out.println(student);
    }


}
