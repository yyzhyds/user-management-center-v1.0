package com.zhy.center.servlet;

import com.zhy.center.service.UserService;
import com.zhy.center.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @description TODO
* @author Lenovo
* @date 7/6/2023 上午10:00
* @version 1.0
*/
@WebServlet("/updateUser")
public class EditServlet extends HttpServlet {
    private UserService us = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String pwd = req.getParameter("password");
        String phone = req.getParameter("s_phone");
        String email = req.getParameter("s_email");
        int uid = Integer.parseInt(id);
        int i = us.updateUser(pwd, phone, email, uid);

        if (i > 0){
            System.out.println("成功");
            resp.sendRedirect("/user");
        }else {
            System.out.println("失败");
            req.setAttribute("msg","修改用户失败");
            req.getRequestDispatcher("/html/add.jsp").forward(req,resp);

        }
    }
}
