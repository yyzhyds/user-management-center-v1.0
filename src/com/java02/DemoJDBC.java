package com.java02;

import java.sql.*;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 上午8:25
* @version 1.0
*/

public class DemoJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /**
         * @author:随缘而愈
         * @date 17/5/2023 上午10:31
         * @description:必出BUG
         * @params [args]
         * @return void
        */

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pwd = "zhy371857855";

        Connection conn = DriverManager.getConnection(url, user, pwd);

        System.out.println(conn);

        String sql2 = "select * from tjrac.user";
        String sql = "insert into tjrac.user (userName,userPassword) values ('嘿嘿','123456')";

        Statement statement = conn.createStatement();
        //statement.execute();

        int i = statement.executeUpdate(sql);
        ResultSet resultSet = statement.executeQuery(sql2);
        //boolean next = resultSet.next();


        while (resultSet.next()){
            System.out.println("ID" + resultSet.getInt(1));
            System.out.println("用户名" + resultSet.getString("userName"));
            System.out.println("密码" + resultSet.getString("userPassword"));
        }

        resultSet.close();
        statement.close();
        conn.close();
    }
}
