package org.example.jdbc;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestJdbcTemplate {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate(){

    }
}
