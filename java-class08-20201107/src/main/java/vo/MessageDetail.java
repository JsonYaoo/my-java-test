/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package vo;

import java.util.Date;

/**
 * Date 2020/10/31 8:09 下午
 * Author muse
 */
public class MessageDetail {

    private Long id;

    private String msgId;

    private String detailContent;

    private Date createTime;

    private Date updateTime;

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

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
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

    @Override
    public String toString() {
        return "MessageDetail{" +
                "id=" + id +
                ", msgId='" + msgId + '\'' +
                ", detailContent='" + detailContent + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
