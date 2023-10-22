package org.example.xml;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //name 不为空,errors，属性名，属性错误名字，属性错误提示信息
        ValidationUtils.rejectIfEmpty(errors, "name",
                "name.error", "name is null");
        //age 0-200之间
        User user = (User) target;
        if (user.getAge() < 0){
            /*rejectValue 拒绝信息*/
            errors.rejectValue("age", "age.error.small", "age < 0");
        }else if(user.getAge() > 200){
            errors.rejectValue("age", "age.error.big", "age > 200");
        }
    }
}
