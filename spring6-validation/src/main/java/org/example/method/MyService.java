package org.example.method;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * 类上加注解@Validated
 * 方法属性加@Valid
 * 实现方法的数据校验
 */
@Service
@Validated
public class MyService {
    public String testMethod(@NotNull @Valid User user){
        return user.toString();
    }
}
