package com.rui.spring.service.impl;

import com.rui.spring.service.BookService;
import com.rui.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/27 9:33
 * @Version 1.0
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;

    @Override
    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(userId,bookId);
        }
    }
}
