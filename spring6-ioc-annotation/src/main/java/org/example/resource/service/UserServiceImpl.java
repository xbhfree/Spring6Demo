package org.example.resource.service;

import jakarta.annotation.Resource;
import org.example.resource.bean.UserBean;
import org.springframework.stereotype.Service;

@Service("reUserServiceImpl")
public class UserServiceImpl implements UserService {
    //根据类型自动匹配
    @Resource(name = "reUserBeanImpl")
    private UserBean userBean;
    @Override
    public void add() {
        System.out.println("re add service...");
        userBean.add();
    }
}
