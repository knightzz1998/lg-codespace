package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: TargetServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/6 16:09
 */
@WebServlet(name = "TargetServlet", urlPatterns = "/target-servlet")
public class TargetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取 request 的属性
        String name = (String) req.getAttribute("name");

        System.out.println("获取来自 ForwardServlet的 name 属性 : " + name);

        // 重定向到 success.html
        resp.sendRedirect("success.html");
    }
}
