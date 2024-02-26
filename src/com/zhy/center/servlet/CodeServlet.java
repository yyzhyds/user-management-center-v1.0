package com.zhy.center.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
* @description TODO
* @author Lenovo
* @date 8/6/2023 下午3:11
* @version 1.0
*/
@WebServlet("/code")
public class CodeServlet extends HttpServlet {
    private static final int width = 200;
    private static final int height = 50;
    private static final String code = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    private Random random = new Random();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
        Graphics g = image.getGraphics();
        g.setColor(getColor(200,40));
        g.fillRect(0,0,width,height);

        for(int i=0;i<100;i++){
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y2 = random.nextInt(width);
            g.setColor(getColor(160,40));
            g.drawLine(x1, y1, x2, y2);
        }
        //输出字符
        String seccode = "";
        Font font = new Font("宋体", Font.ITALIC,width/4);
        g.setFont(font);
        for(int i=0;i<4;i++){
            char c = code.charAt(random.nextInt(code.length()));
            seccode += c;
            g.setColor(getColor(100,40));
            g.drawString(c + "", i*width/4 + 5, 40);
        }
        HttpSession sessino = request.getSession();
        sessino.setAttribute("code",seccode);

        ImageIO.write(image, "JPEG", response.getOutputStream());
        g.dispose();

        ImageIO.write(image, "JPEG", response.getOutputStream());
        g.dispose();
    }
    private Color getColor(int base,int inc){
        int r = base + random.nextInt(inc);
        int g = base + random.nextInt(inc);
        int b = base + random.nextInt(inc);
        return new Color(r,g,b);

    }
}
