package com.zhy.center.dao;


import com.zhy.center.model.User;
import com.zhy.center.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 下午6:57
* @version 1.0
*/

public class UserDAOImpl implements com.zhy.center.dao.UserDAO {
    @Override
    public List<User> selectAll() throws SQLException {
        Connection con = JDBCUtils.getcon();
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery("select  * from tjrac.user order by id desc");

        User u = null;
        List<User> list = new ArrayList<>();

        while (res.next()){
            u = new User();
            u.setId(Integer.parseInt(res.getString("id")));
            u.setUsername(res.getString("userName"));
            u.setPassword(res.getString("userPassword"));
            u.setUserPhone(res.getString("userPhone"));
            u.setUserMail(res.getString("userMail"));
            list.add(u);
        }
        return list;
    }

    @Override
    public User selectOne(User user)  {
        try {
            Connection con = JDBCUtils.getcon();
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("select  * from tjrac.user where userName ='"+user.getUsername()+"'");
            User u = null;
            if (res.next()){
                u = new User();
                u.setId(res.getInt("id"));
                u.setUsername(res.getString("userName"));
                u.setPassword(res.getString("userPassword"));
            }
            return u;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int addUser(User user) {
        try {
            Connection con = JDBCUtils.getcon();
            Statement st = con.createStatement();
            String sql = "insert into tjrac.user(userName,userPassword,userPhone,userMail) values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            pst.setString(3, user.getUserPhone());
            pst.setString(4, user.getUserMail());

            return pst.executeUpdate();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int deleteUser(int id) {
        try {

            Connection con = JDBCUtils.getcon();
            String sql = "delete from tjrac.user where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            int i = pst.executeUpdate();
            return i;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findUserById(int id) {
        try {
            Connection con = JDBCUtils.getcon();
            PreparedStatement pst = con.prepareStatement("select  * from tjrac.user where id = ?");
            pst.setInt(1,id);
            ResultSet res = pst.executeQuery();
            User u = null;
            if (res.next()){
                u = new User();
                u.setId(Integer.parseInt(res.getString("id")));
                u.setUsername(res.getString("userName"));
                u.setPassword(res.getString("userPassword"));
                u.setUserPhone(res.getString("userPhone"));
                u.setUserMail(res.getString("userMail"));
            }
            return u;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public int updateUserById(User user) {
        try {
            Connection con = JDBCUtils.getcon();
            String sql = "update tjrac.user set userPassword = ?,userPhone=?,userMail=? where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, user.getPassword());
            pst.setString(2, user.getUserPhone());
            pst.setString(3, user.getUserMail());
            pst.setInt(4, user.getId());


            return pst.executeUpdate();
    }catch (SQLException e){
        throw new RuntimeException(e);
    }

    }

}
