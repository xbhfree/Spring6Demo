package org.example.resource.service;

import org.springframework.stereotype.Service;

//@Service("reUserRedisServiceImpl")
public class UserRedisServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("re user redis service");
    }
}
