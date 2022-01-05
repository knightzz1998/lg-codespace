package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: MyWebServlet
 * @projectName lg-java-train
 * @description: 使用注解简化Servlet配置
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/2 14:14
 */
@WebServlet(name = "MyWebServlet", urlPatterns = "/my-web-servlet")
public class MyWebServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("==================> MyWebServlet doGet Be Visited");
        // 可以直接让Get请求让Post处理
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("==================> MyWebServlet doPost Be Visited");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("==================> MyWebServlet Service Be Visited");
        // 获取请求方法类型
        String method = req.getMethod();
        System.out.println("method = " + method);
        switch (method) {
            case "GET":
                doGet(req, resp);
                break;
            case "POST":
                doPost(req, resp);
                break;
        }
    }
}
