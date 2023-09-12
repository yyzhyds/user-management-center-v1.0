package demo.servlet;

import demo.entity.User;
import demo.service.UserService;
import demo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
* @description TODO
* @author Lenovo
* @date 17/5/2023 下午8:00
* @version 1.0
*/

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private UserService us = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (null != id){
            User user = us.findUserById(Integer.parseInt(id));
            req.setAttribute("user",user);
            req.getRequestDispatcher("html/edit.jsp").forward(req,resp);
        }else {
            try {
                List<User> users = us.queryAll();
                System.out.println(users);
                req.setAttribute("list",users);
                req.getRequestDispatcher("/html/show.jsp").forward(req,resp);

            } catch (SQLException e) {
                throw new RuntimeException(e);
                //e.printStackTrace();
            }
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
