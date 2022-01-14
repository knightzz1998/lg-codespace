package cn.knightzz.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 王天赐
 * @title: HtmlFilter
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/11 17:27
 */
public class HtmlFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("HtmlFilter init ...");
        String filterName = filterConfig.getFilterName();
        System.out.println("filterName = " + filterName);
        String username = filterConfig.getInitParameter("username");
        System.out.println("InitParameter = " + username);

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入 HtmlFilter => doFilter ");
        chain.doFilter(request, response);
        System.out.println("离开 HtmlFilter => doFilter ");
    }

    @Override
    public void destroy() {
        System.out.println("HtmlFilter destroy ...");
    }
}
