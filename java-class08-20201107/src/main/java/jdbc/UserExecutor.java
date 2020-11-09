/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC示例
 */
//@Slf4j
public class UserExecutor {

    public static final String URL = "jdbc:mysql://localhost:3306/muse";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获得数据库连接
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            //3.操作数据库，实现增删改查
            ps = conn.prepareStatement("SELECT name, age FROM tb_user where id = ?");
            ps.setInt(1, 2);
            rs = ps.executeQuery();
            //如果有数据，rs.next()返回true
            while (rs.next()) {
                System.out.println("姓名：" + rs.getString("name") + "，年龄：" + rs.getInt("age"));
            }
        } catch (SQLException e) {
//            log.error("error", e);
        } finally {
            close(rs, ps, conn);
        }
    }

    private static void close(ResultSet rs, Statement stmt, Connection connection) {
        try {
            if (rs !=null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
//            log.error("rs.close() error!", e);
        }

        try {
            if (stmt != null && stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
//            log.error("stmt.close() error!", e);
        }

        try {
            if (connection != null && connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
//            log.error("connection.close() error!", e);
        }

    }
}
