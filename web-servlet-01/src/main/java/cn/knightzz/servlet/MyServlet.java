package cn.knightzz.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: MyServlet
 * @projectName lg-java-train
 * @description: 直接实现Servlet接口
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/1 20:43
 */
public class MyServlet implements Servlet {

    public MyServlet() {
        System.out.println("=======> MyServlet create instance");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("=======> MyServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.getServletConfig();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("=======> MyServlet service be visited");
    }

    @Override
    public String getServletInfo() {
        return this.getServletInfo();
    }

    @Override
    public void destroy() {
        System.out.println("=======> MyServlet destroy");
    }
}
