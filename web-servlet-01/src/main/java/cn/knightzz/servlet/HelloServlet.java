package cn.knightzz.servlet;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: HelloServlet
 * @projectName lg-java-train
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2021/12/30 14:20
 */
public class HelloServlet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("begin =====> HelloServlet doGet");
        super.doGet(req, resp);
        System.out.println("end =====> doGet");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("begin =====> HelloServlet ServletRequest");
        super.service(req, res);
        System.out.println("end =====> HelloServlet ServletRequest");
    }
}
