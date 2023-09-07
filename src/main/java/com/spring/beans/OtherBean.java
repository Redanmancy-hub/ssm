package com.spring.beans;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
public class OtherBean {

 /*   @Bean("dataSource")
    public DataSource dataSource(@Value("${jdbc.driver}") String driverClassName, @Autowired UserDao userDao){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/mybatisdb");
        dataSource.setUsername("root");
        dataSource.setPassword("hu020808");
        return dataSource;
    }*/
}
