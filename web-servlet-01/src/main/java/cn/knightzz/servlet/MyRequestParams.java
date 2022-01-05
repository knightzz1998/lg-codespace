package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author 王天赐
 * @title: MyRequestParams
 * @projectName lg-java-train
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/5 14:08
 */
@WebServlet(name = "MyRequestParams", urlPatterns = "/my-request-params")
public class MyRequestParams extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("<==================获取所有参数的值=================>");


        // 1. 根据指定的name获取数据
        String name = req.getParameter("name");
        String age = req.getParameter("age");

        // 2. 获取多选数据 一个 name => 多个值
        String[] skills = req.getParameterValues("skills");

        for (int i = 0; i < skills.length; i++) {
            System.out.println("skills[i] = " + skills[i]);
        }

        System.out.println("<==================获取所有参数的名称=================>");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            System.out.println("parameterName = " + parameterName);
        }
    }
}
