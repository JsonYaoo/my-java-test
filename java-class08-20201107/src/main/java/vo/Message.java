/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package vo;

import java.util.Date;

/**
 * Date 2020/10/28 10:32 上午
 * Author muse
 */
public class Message {

    private Long id;

    private String msgId;

    private Integer status;

    private String content;

    private Integer deleted;

    private Date createTime;

    private Date updateTime;

    private MessageDetail messageDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public MessageDetail getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(MessageDetail messageDetail) {
        this.messageDetail = messageDetail;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msgId='" + msgId + '\'' +
                ", status=" + status +
                ", content='" + content + '\'' +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", messageDetail=" + messageDetail +
                '}';
    }
}
