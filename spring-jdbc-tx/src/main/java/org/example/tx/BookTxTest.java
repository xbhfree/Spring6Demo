package org.example.tx;

import org.example.tx.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class BookTxTest {
    @Autowired
    private UserController userController;

    @Test
    public void testBuyBook(){
        userController.buyBook(1,1);
    }


    //测试事务的传播行为

    /**
     * 测试数据为  a书 50， b书 50， 用户余额99 ，
     * 由于UserServiceImpl的事务传播级别为REQUIRES_NEW
     * 所以a书库存减少，用户余额减少，b书购买失败，即每次开启新事物的证明
     */
    @Test
    public void testBuyBooks(){
        Integer[] bookIds = {1, 2};
        userController.buyBooks(bookIds, 1);
    }
}
