package com.spring.dao.impl;

import com.spring.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("userDao")
//@Scope("singleton")
//@Lazy(false)

public class UserDaoImpl implements UserDao {


    @Override
    public void show() {

    }


    /*public UserDaoImpl() {
        System.out.println("userDao创建");
    }

    @PostConstruct
    public void init() {
        System.out.println("userDao初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("userDao被销毁");
    }*/
}
