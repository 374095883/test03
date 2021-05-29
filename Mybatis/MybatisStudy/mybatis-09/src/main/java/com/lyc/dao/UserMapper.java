package com.lyc.dao;

import com.lyc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
