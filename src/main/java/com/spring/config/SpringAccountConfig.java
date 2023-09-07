package com.spring.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@MapperScan(basePackages = "com.spring.mapper")
@PropertySource({"classpath:jdbc.properties"})
@ComponentScan(basePackages = {"com.spring"})
public class SpringAccountConfig {
}
