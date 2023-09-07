package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages = "com.spring")
@EnableAspectJAutoProxy
public class SpringAopConfig {
}
