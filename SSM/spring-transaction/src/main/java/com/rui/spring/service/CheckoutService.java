package com.rui.spring.service;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 9:32
 * @Version 1.0
 */
public interface CheckoutService {

    //结账
    void checkout(Integer userId, Integer[] bookIds);
}
