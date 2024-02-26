package com.zhy.center.service;


import com.zhy.center.model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 17/5/2023 下午6:34
 */

public interface UserService {

    //  查询所有用户
    List<User> queryAll() throws SQLException;

    //  查询一个用户
    User queryOne(String name) ;

    //  添加用户
    int addUse(User user);

    //  删除用户
    int deleteUser(int id);

    User findUserById(int id);
    //  修改用户
    int updateUser(String password,String phone ,String email,int id) ;

}