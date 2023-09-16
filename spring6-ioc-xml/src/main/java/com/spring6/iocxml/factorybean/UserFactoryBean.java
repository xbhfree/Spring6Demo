package com.spring6.iocxml.factorybean;

import com.spring6.iocxml.bean_lifecycle.User;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        //return null;
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
        //return null;
    }
}
