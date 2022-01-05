package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: MyHttpServlet
 * @projectName lg-java-train
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/1 21:55
 */
public class MyHttpServlet extends HttpServlet {
    public MyHttpServlet() {
        System.out.println("MyHttpServlet create instance ... ");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MyHttpServlet be visited ... ");
    }

    @Override
    public void destroy() {
        System.out.println("MyHttpServlet destroy ... ");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("MyHttpServlet init ... ");
    }
}
