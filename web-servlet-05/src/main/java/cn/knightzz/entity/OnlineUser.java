package cn.knightzz.entity;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author 王天赐
 * @title: OnlineUser
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/15 10:43
 */
public class OnlineUser implements HttpSessionListener, ServletContextListener {

    ServletContext context = null;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        this.context = sce.getServletContext();
        context.setAttribute("onlineUser", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        this.context = null;
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        Integer onlineUser = (Integer) context.getAttribute("onlineUser");
        context.setAttribute("onlineUser", onlineUser + 1);
        System.out.println("新增在线人数 1 人, 当前在线人数 : " + (onlineUser + 1));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        Integer onlineUser = (Integer) context.getAttribute("onlineUser");
        context.setAttribute("onlineUser", onlineUser - 1);
        System.out.println("下线人数 1 人, 当前在线人数 : " + (onlineUser - 1));
    }
}
