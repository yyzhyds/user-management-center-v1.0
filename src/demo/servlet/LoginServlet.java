package demo.servlet;

import demo.entity.User;
import demo.service.UserService;
import demo.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
* @description TODO
* @author Lenovo
* @date 10/5/2023 上午10:42
* @version 1.0
*/
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    /**
     * @author:随缘而愈
     * @date 10/5/2023 上午10:44
     * @description:必出BUG
     * @params [req, resp]
     * @return void
     *  1.获取请求参数：使用req.getParameter(参数名);
     *  2.调用业务方法：调用方法，操作数据库。
     *  3.响应结果数据：响应JSON字符串，跳转页面
     *
    */
    private UserService us = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        String name = req.getParameter("name");
        String pwd = req.getParameter("password");
        User user = us.queryOne(name);


        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        HttpSession session = req.getSession();
        String oldCode=(String)session.getAttribute("code");

        PrintWriter out = resp.getWriter();
        String code = req.getParameter("code");


        System.out.println("code = " + code);
        System.out.println("oldCode = " + oldCode);


        if(user != null && user.getPassword().equals(pwd) && code.equals(oldCode)){
            System.out.println("登录成功！！！");
            //HttpSession session1 = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("/html/index.jsp");
        }else {
            System.out.println("登录失败");
            req.setAttribute("msg","用户名或密码错误，请重新登录！");
            req.getRequestDispatcher("/html/login.jsp").forward(req,resp);
        }

        out.flush();
        out.close();

            /*req.setCharacterEncoding("UTF-8");
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();

            String secode = req.getParameter("code");

            HttpSession session = req.getSession();
            String oldCode=(String)session.getAttribute("code");*/
            /*if(){
                session.setAttribute("msg","验证码不正确！！");
                req.getRequestDispatcher("/html/login.jsp").forward(req,resp);
                *//*resp.sendRedirect("login.jsp");*//*
            }else{
                out.println("验证码输入正确");
                resp.sendRedirect("/html/index.jsp");
            }*/

            /*out.flush();
            out.close();*/

        // 获取请求参数
//        String name = req.getParameter("name");
//        String password = req.getParameter("password");
//        String code = req.getParameter("code");
//        String json2 = "[User{id=1, username='" + name + "', password='" + password + "'}]";
//        System.out.println(json2);
//
//        System.out.println("name,"+name);
//        System.out.println("password," + password);
//        System.out.println("code,"+code);
//        List<User> users = null;
//        try {
//            users = us.queryOne();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println(users);
//        String json ="";
//        json = users.toString();
//        System.out.println(json);
//        System.out.println();
//        System.out.println(json == json2);
//        System.out.println(json.equals(json2));
//        if (json.equals(json2)){
//            System.out.println("成功！！");
//            resp.sendRedirect("/html/index.jsp");
//        }else {
//            req.getRequestDispatcher("/html/login.jsp").forward(req,resp);
//        }
//        User user = new User();
//        HttpSession session = req.getSession();
//        session.setAttribute("user",user);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
