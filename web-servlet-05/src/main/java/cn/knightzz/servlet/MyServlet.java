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
 * @title: HelloServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/12 21:52
 */
@WebServlet(name = "MyServlet", urlPatterns = "/my-servlet")
public class MyServlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("MyServlet init ...");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyServlet doPost ...");
        req.setAttribute("username", "root");
        req.setAttribute("username", "2068");
        req.removeAttribute("username");

        HttpSession session = req.getSession(true);
        System.out.println("创建 Session ... ");

        session.setAttribute("name", "TOM");
        session.setAttribute("name", "TOM");
        session.removeAttribute("name");

    }

    @Override
    public void destroy() {
        // Tomcat 服务器关闭时, Servlet对象才会销毁
        System.out.println("MyServlet destroy ...");
    }
}
