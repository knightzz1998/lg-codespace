package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 王天赐
 * @title: ThreadServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/9 9:56
 */
@WebServlet(name="ThreadServlet", urlPatterns = "/thread-servlet")
public class ThreadServlet extends HttpServlet {

    /**
     * 共享变量
     */
    private String name;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        synchronized (this) {
            // 获取参数
            name = req.getParameter("name");

            // 睡眠5s, 模拟并发
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 获取输出流
            PrintWriter writer = resp.getWriter();
            writer.write("<h2>" + name + "</h2>");
            writer.close();
        }
    }
}
