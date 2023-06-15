package com.rui.spring.service.impl;

import com.rui.spring.dao.BookDao;
import com.rui.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.concurrent.TimeUnit;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 21:52
 * @Version 1.0
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    @Transactional(
//            readOnly = true
//            timeout = 3
//            noRollbackForClassName = "java.lang.ArithmeticException"
//            isolation = Isolation.DEFAULT
            propagation = Propagation.REQUIRES_NEW
    )
    public void buyBook(Integer userId, Integer bookId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);

        //更新图书的库存
        bookDao.updateStock(bookId);

        //更新用户的余额
        bookDao.updateBalance(userId,price);
//        System.out.println(1/0);
    }
}
