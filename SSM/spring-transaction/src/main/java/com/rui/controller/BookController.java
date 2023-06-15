package com.rui.controller;

import com.rui.spring.service.BookService;
import com.rui.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 21:51
 * @Version 1.0
 */

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId,Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);
    }

}
