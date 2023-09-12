package com.java01;
/**
* @description TODO
* @author Lenovo
* @date 6/5/2023 上午8:53
* @version 1.0
*/

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author:随缘而愈
 * @date 6/5/2023 上午8:54
 * 1.实现.
 *
*/
public class MyServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("你好，哈哈");
        servletResponse.setContentType("text/html;charset=utf8");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>哈哈</h1>");
        writer.flush();
        writer.close();
    }

    @Override
    public String getServletInfo() {
        return null;
    }


    @Override
    public void destroy() {

    }
}
