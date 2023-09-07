package com.spring.mapper;

import com.spring.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有用户
     */
    List<User> getAllUser();
}
