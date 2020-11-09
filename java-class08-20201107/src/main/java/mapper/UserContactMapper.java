/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import vo.UserContact;

/**
 * Date 2020/11/1 9:32 下午
 */
public interface UserContactMapper {

    List<UserContact> getUserContactByUserId(@Param("userId") Long userId);
}
