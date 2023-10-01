package org.example.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
/*Retention保留*/
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {
}
