package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.mapper.UserMapper;
import com.spring.pojo.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userService")
public class UserServiceImpl implements UserService {
/*
    @Autowired
    private UserMapper userMapper;

    @Autowired //根据类型注入
    private UserDao userDao;

    @Override
    public void show() {
        List<User> userList = userMapper.getAllUser();
        userList.forEach(user -> System.out.println(user));
    }*/

    @Override
    public void show1() {
        System.out.println("show1...");
    }

    @Override
    public void show2() {
        System.out.println("show2...");
    }
}
