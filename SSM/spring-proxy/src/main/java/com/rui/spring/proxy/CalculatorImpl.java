package com.rui.spring.proxy;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 14:37
 * @Version 1.0
 */
public class CalculatorImpl implements Calculator{


    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部，result:" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部，result:" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("方法内部，result:" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部，result:" + result);
        return result;
    }
}
