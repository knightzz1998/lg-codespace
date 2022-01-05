package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: MyParams
 * @projectName lg-java-train
 * @description: 测试请求参数
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/2 21:51
 */
@WebServlet(name = "MyParams", urlPatterns = "/my-params") // 这里需要特别注意 加 /url路径
public class MyParams extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyParams doPost ====>");

        // 获取请求资源路径
        System.out.println("req.getRequestURI() = " + req.getRequestURI());
        // 获取请求的完整路径
        System.out.println("req.getRequestURL() = " + req.getRequestURL());
        // 获取HTTP请求方式
        System.out.println("req.getMethod() = " + req.getMethod());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyParams doGet ====>");
        this.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyParams service ====>");
        String method = req.getMethod();
        switch (method) {
            case "POST":
                this.doPost(req, resp);
                break;
            case "GET":
                this.doGet(req, resp);
                break;
        }
    }
}
