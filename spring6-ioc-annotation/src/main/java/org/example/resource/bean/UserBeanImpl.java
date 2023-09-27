package org.example.resource.bean;

import org.springframework.stereotype.Repository;

@Repository("reUserBeanImpl")
public class UserBeanImpl implements UserBean {
    @Override
    public void add() {
        System.out.println("re add bean...");
    }
}
