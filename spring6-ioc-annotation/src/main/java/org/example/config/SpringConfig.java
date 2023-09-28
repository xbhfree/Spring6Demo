package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 全注解开发，用配置类代替xml
 */
@Configuration//配置类
@ComponentScan("org.example")//扫描包
public class SpringConfig {
}
