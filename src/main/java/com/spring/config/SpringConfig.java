package com.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.beans.OtherBean;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration //标注当前类是一个配置类（代替配置文件）+@Component
//<context:component-scan base-package="com.spring"></context:component-scan>
@ComponentScan(basePackages = {"com.spring"})
//<context:property-placeholder location="jdbc.properties"></context:property-placeholder>
@PropertySource({"classpath:jdbc.properties"})
//<import resource=""></import>
@Import(OtherBean.class)
//mapper的接口扫描
@MapperScan(basePackages = "com.spring.mapper")
public class SpringConfig {

    @Bean("dataSource")
    public DataSource dataSource(
            @Value("${jdbc.driver}") String driver,
            @Value("${jdbc.url}") String url,
            @Value("${jdbc.username}") String username,
            @Value("${jdbc.password}") String password
    ){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean("sqlSessionFactoryBean")
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

}
