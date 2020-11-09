/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mapper.UserMapper;
import util.SqlSessionFactoryUtil;
import vo.User;

/**
 * Mybatis示例
 */
public class UserExecuter {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserById(2L);
            System.out.println("姓名：" + user.getName() + "，年龄：" + user.getAge());

//            User userParam = new User();
//            userParam.setName("muse1");
//            userParam.setId(1L);
//            userParam.setAge(22);
//            List<User> user = userMapper.getUserByUser(userParam);
//            System.out.println("user = " + user);


            /** choose--when--otherwise*/
//            User userParam = new User();
//            userParam.setName("muse1");
//            // userParam.setId(1L);
//            userParam.setAge(22);
//            List<User> user = userMapper.getUserByUser2(userParam);
//            System.out.println("user = " + user);

            /** where*/
//            User userParam = new User();
//            userParam.setId(1L);
//            List<User> user = userMapper.getUserByUser3(userParam);
//            System.out.println("user = " + user);

            /** trim*/
//            User userParam = new User();
//            userParam.setId(1L);
//            List<User> user = userMapper.getUserByUser4(userParam);
//            System.out.println("user = " + user);

            /** set*/
//            User userParam = new User();
//            userParam.setId(1L);
//            userParam.setName("muse");
//            userParam.setAge(22);
//            userMapper.updateUserByUser(userParam);
//            sqlSession.commit();

            /** foreach*/
//            List<Long> ids = new ArrayList<>();
//            ids.add(1L);
//            ids.add(2L);
//            ids.add(3L);
//            ids.add(4L);
//            List<User> users = userMapper.getUserByIds(ids);
//            System.out.println("users = " + users);

            /** concat & bind */
//            List<User> users = userMapper.getUserByName("muse");
//            System.out.println("users = " + users);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
