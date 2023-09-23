package org.example.autowired.bean;

import org.springframework.stereotype.Repository;

@Repository
public class UserBeanImpl implements UserBean{
    @Override
    public void add() {
        System.out.println("add bean...");
    }
}
