package com.zhuawa.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置信息 实体
 * @author zhibai
 * @Date 2020/2/16 00:34
 */
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
    private String sayWhat;
    private String toWho;

    public String getSayWhat() {
        return sayWhat;
    }

    public void setSayWhat(String sayWhat) {
        this.sayWhat = sayWhat;
    }

    public String getToWho() {
        return toWho;
    }

    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
}
