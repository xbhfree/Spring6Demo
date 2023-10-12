package org.example.jdbc;


import org.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Arrays;
import java.util.List;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 增加
     */
    @Test
    public void testUpdate(){
        // 增删改都可用update实现 id,name,age,sex
        Object[] params =  {"alen", 30, "男"};
        //id 自增设置为null
        String sql = "insert into t_emp values(null, ?, ?, ?)";
        int res = jdbcTemplate.update(sql, params);
        System.out.println(res);
    }

    /**
     * 删除
     */
    @Test
    public void testUpdate02(){
        // 增删改都可用update实现 id,name,age,sex
        //id 自增设置为null
        String sql = "delete from t_emp where id = ?";
        int res = jdbcTemplate.update(sql, 1);
        System.out.println(res);
    }

    /**
     *
     *  修改
     *
     */
    @Test
    public void testUpdate03(){
        String sql = "update t_emp set name = ? where id = ?";
        int res = jdbcTemplate.update(sql, "bella" , 2);
        System.out.println(res);
    }


    /**
     * 查询对象
     */
    @Test
    public void testQueryObject(){
        String sql = "select * from t_emp where id = ?";
        User user = new User();
        /*user = jdbcTemplate.queryForObject(sql, (t, r) ->{
            User t_user = new User();
            t_user.setId(t.getInt("id"));
            t_user.setName(t.getString("name"));
            t_user.setAge(t.getInt("age"));
            t_user.setSex(t.getString("sex"));
            return t_user;
        } ,2);*/
        user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 2);
        System.out.println(user);
    }


    /**
     * 查询数组
     */
    @Test
    public void testQueryList(){
        String sql = "select * from t_emp";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        System.out.println(userList);
    }


    /**
     * 查询单个值
     */
    @Test
    public void testQuerySingleton(){
        String sql = "select count(*) from t_emp";
        int res = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(res);
    }
}
