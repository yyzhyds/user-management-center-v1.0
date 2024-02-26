package com.zhy.center.demo.java01;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
* @description TODO
* @author Lenovo
* @date 6/5/2023 上午10:46
* @version 1.0
*/

@WebServlet("/MyHttp")
public class MyHttp extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=utf8");
        PrintWriter writer = res.getWriter();
        writer.println("<h1>嘿嘿</h1>");
        writer.flush();
        writer.close();
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("adw");
//        resp.setContentType("text/html;charset=utf8");
//        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>我是doGet</h1>");
//        writer.flush();
//        writer.close();
//    }
}
