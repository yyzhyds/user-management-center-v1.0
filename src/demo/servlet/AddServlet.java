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

/**
* @description TODO
* @author Lenovo
* @date 31/5/2023 下午7:03
* @version 1.0
*/
@WebServlet("/addUser")
public class AddServlet extends HttpServlet {
    private UserService us = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pwd = req.getParameter("password");
        String repwd = req.getParameter("pass");
        String phone = req.getParameter("s_phone");
        String email = req.getParameter("s_email");
        User user = new User(null,name,pwd,email,phone);
        int i = us.addUse(user);
        if (i > 0){
            System.out.println("成功");
            resp.sendRedirect("/user");
        }else {
            System.out.println("失败");
            req.setAttribute("msg","添加用户失败");
            req.getRequestDispatcher("/html/add.jsp").forward(req,resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
    //    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String pwd = req.getParameter("password");
//        String phone = req.getParameter("s_phone");
//        String email = req.getParameter("s_email");
//
//        System.out.println("name = " + name);
//        System.out.println("pwd = " + pwd);
//        System.out.println("phone = " + phone);
//        System.out.println("email = " + email);
//    }


}
