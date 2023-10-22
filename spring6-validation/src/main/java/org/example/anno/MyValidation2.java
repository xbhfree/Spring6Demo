package org.example.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

@Service
public class MyValidation2 {
    @Autowired
    private Validator validator;

    public boolean validatorByPersonTwo(Person person){
        BindException bindException = new BindException(person, person.getName());
        validator.validate(person, bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }
}
