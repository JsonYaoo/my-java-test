/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import vo.User;

/**
 * Hibernate示例
 */
public class UserExecutor {

    //保存用户的案例
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.openSession();
            User user = session.get(User.class, 2L);
            System.out.println("姓名：" + user.getName() + "，年龄：" + user.getAge());
        } finally {
            if (session != null) {
                //7. 释放资源
                session.close();
                sessionFactory.close();
            }
        }

    }

}
