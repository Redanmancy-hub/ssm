package com.spring.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AccountMapper {
    //减钱
    @Update("update account set money = money - #{money} where account_name = #{accountName}")
    void increaseMoney(@Param("accountName") String accountName, @Param("money") Integer money);
    //加钱
    @Update("update account set money = money + #{money} where account_name = #{accountName}")
    void deleteMoney(@Param("accountName") String accountName,@Param("money") Integer money);
}
