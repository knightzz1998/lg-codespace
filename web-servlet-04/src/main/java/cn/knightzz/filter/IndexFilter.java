package cn.knightzz.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: IndexFilter
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/12 14:02
 */
public class IndexFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("IndexFilter init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入 IndexFilter => doFilter ");
        System.out.println("校验 token ...");
        chain.doFilter(request, response);
        System.out.println("离开 IndexFilter => doFilter ");
    }

    @Override
    public void destroy() {
        System.out.println("IndexFilter destroy ...");
    }
}
