package com.lyc.dao;

import com.lyc.dao.UserMapper;
import com.lyc.pojo.User;
import com.lyc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

    //  select * from mybatis.user where id = #{id}
    //类型处理器
    //  select id,name,pwd from mybatis.user where id = #{id}

}
