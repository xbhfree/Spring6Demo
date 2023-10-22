package org.example.myValidator;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    @NotNull
    private String name;

    @Min(0)
    @Max(200)
    private int age;

    //手机号码1开头，后跟34578，总共9位数
    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机格式不对")
    private String phoneNum;

    @CannotBlank
    private String msg;
}
