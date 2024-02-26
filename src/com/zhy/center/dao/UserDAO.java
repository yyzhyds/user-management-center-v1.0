package com.zhy.center.dao;


import com.zhy.center.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/5/2023 下午6:55
 */

public interface UserDAO {
    List<User> selectAll() throws SQLException;
    User selectOne(User user) ;
    //  添加用户
    int addUser(User user);
    //  删除用户
    int deleteUser(int id);

    User findUserById(int id);

    int updateUserById(User user) ;

}