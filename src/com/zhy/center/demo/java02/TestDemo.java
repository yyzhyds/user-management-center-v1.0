package com.zhy.center.demo.java02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 上午11:08
* @version 1.0
*/

public class TestDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCUtilsTest.getcon();
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("select * from tjrac.user");
        while (res.next()){
            System.out.println("ID" + res.getInt(1));
            System.out.println("用户名：" + res.getString("userName"));
            System.out.println("密码：" + res.getString("userPassword"));
        }

    }
}
