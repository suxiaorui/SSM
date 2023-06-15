package com.rui.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 19:33
 * @Version 1.0
 */

@Component
@Aspect
@Order(1)
public class ValidateAspect {

//    @Before("execution(* com.rui.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.rui.spring.aop.annotation.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect——》前置通知");
    }
}


