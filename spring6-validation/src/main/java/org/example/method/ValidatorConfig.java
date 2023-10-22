package org.example.method;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@Configuration
@ComponentScan("org.example.method")
public class ValidatorConfig {
    @Bean
    public MethodValidationPostProcessor validationPostProcessor(){
        return new MethodValidationPostProcessor();
    }
}
