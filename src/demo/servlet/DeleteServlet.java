package demo.servlet;

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
* @date 7/6/2023 上午8:20
* @version 1.0
*/
@WebServlet("/deleteUser")
public class DeleteServlet extends HttpServlet {
    private UserService us =  new UserServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int i = us.deleteUser(Integer.parseInt(id));
        if(i>0){
            System.out.println("成功");

        }else {
            System.out.println("失败");
        }
        resp.sendRedirect("/user");
    }
}
