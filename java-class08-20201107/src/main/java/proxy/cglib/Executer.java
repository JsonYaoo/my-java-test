/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package proxy.cglib;

import proxy.jdk.MessageService;
import proxy.jdk.MessageServiceImpl;

public class Executer {
    public static void main(String[] args) {
        CglibProxy<PlayService> cglibProxy = new CglibProxy();
        // 代理无接口服务类
        PlayService playService = cglibProxy.getProxy(new PlayService());
        playService.play();

//        CglibProxy<MessageService> cglibProxy1 = new CglibProxy();
//        // 代理有接口服务类
//        MessageService messageService = cglibProxy1.getProxy(new MessageServiceImpl());
//        messageService.sendMessage();
    }
}






