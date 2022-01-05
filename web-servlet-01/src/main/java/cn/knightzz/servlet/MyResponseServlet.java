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
 * @title: MyResponseServlet
 * @projectName lg-java-train
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/5 11:53
 */
@WebServlet(name = "MyResponseServlet", urlPatterns = "/response")
public class MyResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应码
        resp.setContentType("text/html;charset=utf-8");
        // 获取响应输出流
        PrintWriter writer = resp.getWriter();
        // 利用输出流输出信息
        writer.println("<html><body>" +
                "Hello Servlet" +
                "</body></html>");
        // 关闭流
        writer.close();
    }
}
