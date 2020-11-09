/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package business;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import mapper.MessageMapper;
import mapper.UserMapper;
import util.SqlSessionFactoryUtil;
import vo.Message;
import vo.User;

/**
 * Mybatis示例
 */
public class MessageExecuter {

    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtil.openSqlSession();
            MessageMapper messageMapper = sqlSession.getMapper(MessageMapper.class);
//            Message message = messageMapper.getMessageById(2L);
//            System.out.println("getMessageById--->" + message);

            /** SQL注入 */
//            Message message = messageMapper.getMessageByMsgId("1001 and (select count(i) from tb_message) > 0");
//            System.out.println("getMessageByMsgId = " + message);

//             Map map = messageMapper.getMessageMapById(2L);
//             System.out.println("getMessageMapById--->" + map);

//            Map<String, String> paramsMap = new HashMap<>();
//            paramsMap.put("id", "2");
//            paramsMap.put("msgId", "1001");
//            Message message = messageMapper.getMessageByMap(paramsMap);
//            System.out.println("getMessageByMap--->" + message);


//
//            message = messageMapper.getMessageByAnnotation(2L, "1001");
//            System.out.println("getMessageByAnnotation--->" + message);
//
//            Message param = new Message();
//            param.setId(1L);
//            param.setMsgId("1000");
//            message = messageMapper.getMessageByMessage(param);
//            System.out.println("getMessageByMessage--->" + message);
//
//            Message message = new Message();
//            message.setMsgId("1013");
//            message.setContent("bbbb");
//            message.setStatus(1);
//            message.setDeleted(0);
//            message.setCreateTime(new Date());
//            messageMapper.insert(message);
//            System.out.println("insert --->" + message);
//
//            messageMapper.insertAndGetIdBack(message);
//            System.out.println("insertAndGetIdBack --->" + message);
//
//            messageMapper.updateContentById(1L, "bbbb");
//
//            messageMapper.delById(28L);
//
//            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
