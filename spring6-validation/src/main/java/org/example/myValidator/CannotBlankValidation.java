package org.example.myValidator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CannotBlankValidation implements ConstraintValidator<CannotBlank,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value != null && value.contains(" ")){
            //获取默认提示信息
            String defaultConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message = " + defaultConstraintMessageTemplate);
            //禁用默认提示信息
            context.disableDefaultConstraintViolation();
            //设置提示语
            context.buildConstraintViolationWithTemplate("connot contains blank");
            return false;
        }
        return true;
    }
}
