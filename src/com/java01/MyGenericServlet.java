package com.java01;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
* @description TODO
* @author Lenovo
* @date 6/5/2023 上午10:26
* @version 1.0
*/

public class MyGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("你好，哈哈");
        servletResponse.setContentType("text/html;charset=utf8");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>继承</h1>");
        writer.flush();
        writer.close();
    }
}
