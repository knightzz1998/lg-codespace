package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: SessionServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/10 21:36
 */
@WebServlet(name = "SessionServlet", urlPatterns = "/session-servlet")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取session
        HttpSession session = req.getSession();
        System.out.println("session.isNew() = " + session.isNew());
        System.out.println("session.getId() = " + session.getId());

        // 2. 设置session属性
        session.setAttribute("session-name", "Session");

        String attribute = (String) session.getAttribute("session-name");
        System.out.println("attribute = " + attribute);
        // 3. 设置生命周期
        int maxInactiveInterval = session.getMaxInactiveInterval();
        System.out.println("maxInactiveInterval = " + maxInactiveInterval);
        // 设置失效时间, Session对象一般是默认30分钟失效
        session.setMaxInactiveInterval(3600);
    }
}
