package org.example.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void updateUserBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance=balance-? where user_id = ?";
        jdbcTemplate.update(sql, price, userId);
    }
}
