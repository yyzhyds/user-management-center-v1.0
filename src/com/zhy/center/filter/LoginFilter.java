package com.zhy.center.filter;


import com.zhy.center.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @description TODO
* @author Lenovo
* @date 7/6/2023 下午8:39
* @version 1.0
*/
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("这里是登录过滤器");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String path = req.getServletPath();
        System.out.println(path);

        if(path.endsWith("login.jsp" )|| path.contains("/Login")|| path.contains("/code")){
            filterChain.doFilter(req,resp);
        }else {
            User user = (User) req.getSession().getAttribute("user");

            if (null != user){
                filterChain.doFilter(req,resp);
            }else {
                System.out.println("未登录");
                resp.sendRedirect(req.getContextPath()+"/html/login.jsp");
            }
        }



    }

    public void destroy() {

    }
}
