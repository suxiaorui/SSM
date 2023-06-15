package com.rui.proxy;

import com.rui.spring.proxy.Calculator;
import com.rui.spring.proxy.CalculatorImpl;
import com.rui.spring.proxy.CalculatorStaticProxy;
import com.rui.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 15:04
 * @Version 1.0
 */
public class ProxyTest {

    @Test
    public void tetProxy(){
//        CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
//        proxy.add(1,2);
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)  proxyFactory.getProxy();
        proxy.add(1,2);

    }


}
