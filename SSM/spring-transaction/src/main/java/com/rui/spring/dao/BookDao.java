package com.rui.spring.dao;

/**
 * @Author suxiaorui
 * @Description TODO
 * @Date 2023/4/26 21:52
 * @Version 1.0
 */
public interface BookDao {
    ////查询图书的价格
    Integer getPriceByBookId(Integer bookId);

    //更新图书的库存
    void updateStock(Integer bookId);


    //更新用户的余额
    void updateBalance(Integer userId, Integer price);
}
