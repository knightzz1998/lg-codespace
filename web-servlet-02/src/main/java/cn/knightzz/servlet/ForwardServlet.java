package cn.knightzz.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: ForwardServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/6 16:09
 */
@WebServlet(name = "ForwardServlet", urlPatterns = "/forward-servlet")
public class ForwardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1. 在 request 中设置属性信息
        req.setAttribute("name", "张三");

        // 设置转发地址
        RequestDispatcher dispatcher = req.getRequestDispatcher("/target-servlet");
        dispatcher.forward(req, resp);
    }
}
