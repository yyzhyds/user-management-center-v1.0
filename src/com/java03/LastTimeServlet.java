package com.java03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

/**
* @description TODO
* @author Lenovo
* @date 31/5/2023 上午9:19
* @version 1.0
*/
@WebServlet("/lastTime")
public class LastTimeServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.YEAR);
        int i1 = c.get(Calendar.MONTH);
        int i2 = c.get(Calendar.DATE);
        String str = String.valueOf(i +"年" +i1+1 +"月"+ i2+"日");
        System.out.println(str);
        Cookie lastTime = new Cookie("lastTime", str);
        for (Cookie cookie : cookies) {
            if (!cookie.getName().equals("lastTime") || cookies == null) {
                resp.addCookie(lastTime);
                System.out.println(lastTime.getMaxAge());
            }

        }
    }
}
