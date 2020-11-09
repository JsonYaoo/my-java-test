/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package proxy.reflaction;

import java.lang.reflect.Method;

import vo.User;

public class Reflaction {
    public static void main(String[] args) throws Throwable {
        Class clazz = User.class;
        User user = (User) clazz.newInstance();
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(user, "张三");
        System.out.println(user.getName()); // 输出：张三

        Object obj = clazz.newInstance();
        method.invoke(obj, "李四");
        method = clazz.getMethod("getName");
        String name = (String) method.invoke(obj);
        System.out.println(name); // 输出：张三
    }
}
