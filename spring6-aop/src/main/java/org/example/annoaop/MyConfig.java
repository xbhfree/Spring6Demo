package org.example.annoaop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.annoaop")
@EnableAspectJAutoProxy
public class MyConfig {
}
