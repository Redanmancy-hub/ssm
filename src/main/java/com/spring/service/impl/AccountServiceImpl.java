package com.spring.service.impl;

import com.spring.mapper.AccountMapper;
import com.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("AccountService")
//进行事务控制
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Autowired
    public void transformMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.deleteMoney(outAccount,money);
        //int i=1/0;
        accountMapper.increaseMoney(inAccount,money);
    }
}
