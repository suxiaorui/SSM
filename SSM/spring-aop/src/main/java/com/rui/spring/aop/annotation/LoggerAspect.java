package com.rui.spring.aop.annotation;

import com.sun.security.jgss.GSSUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author suxiaorui
 * @Description 在切面中，需要通过指定的注解方法标识为通知方法
 * @Before 前置通知，在目标对象方法执行之前执行
 *
 * 切入点表达式：设置在标识通知的注解的value属性中
 * execution(public int com.rui.spring.aop.annotation.CalculatorImpl.add(int,int)
 * execution(* com.rui.spring.aop.annotation.CalculatorImpl.*(..))
 * 第一个*表示任意的访问修饰符和返回值的类型
 * 第二个*表示类中任意的方法
 * ..表示任意的参数列表
 * 类的地方也可以使用*，表示包下所有的类
 *
 * 重用切入点表达式
 * @Pointcut()
 * public void pointCut(){}
 * @Date 2023/4/26 16:01
 * @Version 1.0
 */

@Component
@Aspect  // 将当前组件标识为切面
public class LoggerAspect {

    @Pointcut("execution(* com.rui.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}

//    @Before("execution(public int com.rui.spring.aop.annotation.CalculatorImpl.add(int,int))")
    @Before("execution(* com.rui.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        //获取连接点所对应方法的参数
        Object[] agrs = joinPoint.getArgs();
        System.out.println("LoggerAspect,方法：" + signature.getName()+",参数："+ Arrays.toString(agrs));
//        System.out.println("LoggerAspect，前置通知");
    }

    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        //获取连接点所对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect，方法：" + signature.getName()+",执行完毕");

    }

    // 在返回通知中若要获取目标对象方法的返回值，只需要通过@AfterReturning注解的returning属性
    // 就可以将通知方法的某个参数指定为接受目标对象方法的返回值的参数
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint,Object result){
        //获取连接点所对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法："+signature.getName()+",结果："+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "ex")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable ex){
        //获取连接点所对应的方法的签名信息
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect,方法：" + signature.getName()+",异常通知" + ex);
    }

    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        //表示目标对象方法的执行
        try {
            System.out.println("环绕通知--》前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知--》返回通知");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知--》异常通知");;
        }finally {
            System.out.println("环绕通知--》后置通知");
        }

        return result;

    }

}
