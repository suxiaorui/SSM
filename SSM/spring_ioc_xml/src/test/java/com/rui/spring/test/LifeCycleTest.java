package com.rui.spring.test;

import com.rui.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 15:27
 * @Version 1.0
 */
public class LifeCycleTest {
    /*
    * 生命周期1 实例化
    生命周期2：依赖注入
    生命周期3：初始化 需要通过bean的init-method属性来指定初始化方法
    * 生命周期4：销毁(IOC容器关闭时候销毁) 需要通过bean的destory-method属性来指定初始化方法
    * */

    @Test
    public void test(){
//      ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
