/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import vo.MessageDetail;

public interface MessageDetailMapper {

    MessageDetail getMessageByMsgId(@Param("msgId") String msgId);

    MessageDetail getMessageByMsgIdAndCreateTime(@Param("msgId") String msgId, @Param("content") String content);
}
