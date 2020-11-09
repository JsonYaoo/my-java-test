/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import vo.Message;

public interface MessageMapper {

    Message getMessageById(@Param("id") Long id);

    Map getMessageMapById(@Param("id") Long id);

    Message getMessageByMsgId(@Param("msgId") String msgId);

    Message getMessageByMap(Map<String, String> params);

    Message getMessageByAnnotation(@Param("id") Long id, @Param("msgId") String msgId);

    Message getMessageByMessage(Message message);

    int insert(Message message);

    int insertAndGetIdBack(Message message);

    int updateContentById(@Param("id") Long id, @Param("content") String content);

    int delById(@Param("id") Long id);

    Message getMessageAndMessageDetailById(@Param("id") Long id);

    Message getMessageAndMessageDetailById1(@Param("id") Long id);
}
