package org.example.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 购买多本书，测试事务的传播行为
 */
@Transactional
@Service
public class CheckServiceImpl implements CheckService{
    @Autowired
    private UserService userService;


    @Override
    public void buyBooks(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            userService.buyBook(bookId, userId);
        }
    }
}
