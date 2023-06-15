package com.rui.spring.test;

import com.rui.spring.aop.annotation.Calculator;
import com.rui.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 16:12
 * @Version 1.0
 */
public class AOPTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.sub(1,2);
    }

}
