/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package business;

import org.apache.ibatis.session.SqlSession;

import mapper.UserMapper;
import util.SqlSessionFactoryUtil;
import vo.User;

/**
 * Date 2020/11/2 7:49 下午
 */
public class CacheExecuter {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user1 = userMapper.getUserById(1L);
        System.out.println("----真实查询-----user1 = " + user1);

        //当使用二级缓存的时候，只有调用了commit方法后才会生效。
        sqlSession.commit();

        User user2 = userMapper.getUserById(1L);
        System.out.println("----缓存查询-----user2 = " + user2);

        /**
         * 开启了新的sqlSession，则无法利用一级缓存。因为一级缓存是sqlSession之间隔离的。
         */
        sqlSession = SqlSessionFactoryUtil.openSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        User user3 = userMapper.getUserById(1L);
        System.out.println("----真实查询-----user3 = " + user3);
    }
}
