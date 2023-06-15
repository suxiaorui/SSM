package com.rui.spring.factory;

import com.rui.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/24 16:03
 * @Version 1.0
 */

/*
* FactoryBean 是一个接口 需要创建一个类来实现接口
* 其中有三个方法
* getObject() 通过一个对象交给IOC容器管理
* getObjectType() 设置所提供的对象的类型
* isSingleton   所提供的对象是否单例
* 当把FactoryBean的实现类配置为bean时，会将当前类中getObject()所返回的对象交给IOC容器来管理
 */


public class UserFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
