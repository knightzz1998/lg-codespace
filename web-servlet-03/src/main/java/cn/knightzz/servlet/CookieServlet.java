package cn.knightzz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: CookieServlet
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/9 18:58
 */
@WebServlet(name = "CookieServlet", urlPatterns = "/cookie-servlet")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 创建Cookie信息
        Cookie cookie = new Cookie("name", "Tom");
        // 2. 获取Cookie的默认使用期限 单位是 秒
        int maxAge = cookie.getMaxAge();
        System.out.println("maxAge = " + maxAge);
        // 3. 修改Cookie的默认使用期限
        cookie.setMaxAge(36000);
        // 4. 将Cookie添加到响应信息中
        resp.addCookie(cookie);

        // 重定向到 success.html 页面
        resp.sendRedirect("success.html");
    }
}
