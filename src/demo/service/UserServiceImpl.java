package demo.service;

import demo.dao.UserDAO;
import demo.dao.UserDAOImpl;
import demo.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 下午6:48
* @version 1.0
*/

public class UserServiceImpl implements demo.service.UserService {

    UserDAO us = new UserDAOImpl();
    @Override
    public List<User> queryAll() throws SQLException {
        return us.selectAll();
    }

    @Override
    public User queryOne(String name)  {
        User u = new User(name);
        return us.selectOne(u);
    }

    @Override
    public int addUse(User user) {

        return us.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return us.deleteUser(id);
    }

    @Override
    public User findUserById(int id) {

        return us.findUserById(id);
    }

    @Override
    public int updateUser(String password,String phone ,String email, int id)  {
        User user = new User(password, phone, email);
        return us.updateUserById(user);
    }


}
