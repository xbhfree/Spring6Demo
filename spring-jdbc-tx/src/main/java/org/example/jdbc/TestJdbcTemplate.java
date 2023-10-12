package org.example.jdbc;


import org.example.pojo.Emp;
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
        Emp Emp = new Emp();
        /*Emp = jdbcTemplate.queryForObject(sql, (t, r) ->{
            Emp t_Emp = new Emp();
            t_Emp.setId(t.getInt("id"));
            t_Emp.setName(t.getString("name"));
            t_Emp.setAge(t.getInt("age"));
            t_Emp.setSex(t.getString("sex"));
            return t_Emp;
        } ,2);*/
        Emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(Emp);
    }


    /**
     * 查询数组
     */
    @Test
    public void testQueryList(){
        String sql = "select * from t_emp";
        List<Emp> EmpList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(EmpList);
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
