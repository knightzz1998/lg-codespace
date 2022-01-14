package cn.knightzz.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: LoginServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/12 11:43
 */
@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("username = " + username);
        System.out.println("password = " + password);

        if ("root".equals(username) && "123456".equals(password)) {

            System.out.println("登陆成功");

            // 获取Session
            HttpSession session = req.getSession();
            // 如果登录成功, 就将用户名作为token存储在session中
            session.setAttribute("token", username);
            // 转发请求到 success.html
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.html");
            requestDispatcher.forward(req, resp);

        }else{
            System.out.println("登陆失败!");
            resp.sendRedirect("error.html");
        }
     }
}
