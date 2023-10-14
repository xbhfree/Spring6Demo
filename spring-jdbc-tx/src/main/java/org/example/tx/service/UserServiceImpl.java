package org.example.tx.service;

import org.example.tx.dao.BookDao;
import org.example.tx.dao.BookDaoImpl;
import org.example.tx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Autowired
    private BookDao bookDao;
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        // 查询书价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 减书库存
        bookDao.updateBookStock(bookId);
        //减用户余额
        userDao.updateUserBalance(userId, price);
    }
}
