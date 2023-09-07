package com.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public interface AccountService {
    @Autowired
    void transformMoney(String outAccount,String inAccount,Integer money);
}
