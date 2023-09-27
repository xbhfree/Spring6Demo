package org.example.autowired.service;

import org.springframework.stereotype.Service;

@Service
public class UserRedisServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("user redis service");
    }
}
