package com.rui.spring.test;

import com.rui.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/25 10:28
 * @Version 1.0
 */

public class IOBCByAnnotationTest {

    /*
    * @Component    将类标识为普通组件
    * @Controller   将类标识为控制层组件
    * @Service      将类标识为业务层组件
    * @Repository   将类标识为持久层组件
    *
    * 通过注解加扫描所配置的bean的id，默认值为类的小驼峰，即类名的首字母为小写的结果
    * */

    @Test
    public void test(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("userController",UserController.class);
//        System.out.println(userController);
//        UserService userService = ioc.getBean("userServiceImpl",UserService.class);
//        System.out.println(userService);
//        UserDao userDao = ioc.getBean("userDaoImpl",UserDao.class);
//        System.out.println(userDao);
        userController.saveUser();
    }

}
