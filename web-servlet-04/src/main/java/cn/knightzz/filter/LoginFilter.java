package cn.knightzz.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: LoginFilter
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/11 16:38
 */
public class LoginFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoginFilter init ...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("进入 LoginFilter　=>　doFilter");
        chain.doFilter(request, response);
        System.out.println("离开 LoginFilter　=>　doFilter");
    }

    @Override
    public void destroy() {
        System.out.println("LoginFilter destroy ...");
    }
}
