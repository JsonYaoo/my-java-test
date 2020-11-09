/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.User;

public interface UserMapper {

    User getUserById(@Param("id") Long id);

    User getUserAndContactById(@Param("id") Long id);

    User getAllMessage(@Param("id") Long id);

    List<User> getUserByUser(User user);

    List<User> getUserByUser2(User user);

    List<User> getUserByUser3(User user);

    List<User> getUserByUser4(User user);

    List<User> getUserByIds(@Param("idList") List<Long> idList);

    List<User> getUserByName(@Param("name") String name);

    int updateUserByUser(User user);

    int insert(@Param("user") User user);

    int delById(@Param("id") Long id);

}
