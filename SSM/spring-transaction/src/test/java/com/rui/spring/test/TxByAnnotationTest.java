package com.rui.spring.test;

import com.rui.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 22:06
 * @Version 1.0
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx-annotation.xml")
public class TxByAnnotationTest {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
//        bookController.buyBook(1,1);
        bookController.checkout(1,new Integer[]{1,2});
    }

}
