package com.zhy.center.demo.java03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @description
 * cookie：存储在客户端浏览器
 *  getCookies() 获取所有cookie
 *  addCookie()
 * TODO
* @author Lenovo
* @date 31/5/2023 上午8:29
* @version 1.0
*/
@WebServlet("/cookie")
public class DemoCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("123","456");
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        System.out.println(cookies);

    }


}
