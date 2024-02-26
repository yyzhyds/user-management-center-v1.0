package com.zhy.center.demo.java02;

import java.sql.*;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 上午11:01
* @version 1.0
*/

public class JDBCUtilsTest {

    //定义连接参数
    private static String url = "jdbc:mysql://localhost:3306";
    private static String user = "root";
    private static String pwd = "zhy371857855";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取Connection连接对象
    public static Connection getcon() throws SQLException {
        return DriverManager.getConnection(url,user,pwd);
    }
    //关闭资源
    public static void close(ResultSet rs, Statement st, Connection conn) throws SQLException {
        if (rs !=null){
            rs.close();
        }
        if (st !=null){
            st.close();
        }
        if (conn !=null){
            conn.close();
        }
    }
}
