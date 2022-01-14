package cn.knightzz.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author 王天赐
 * @title: MyServletRequestListener
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/12 22:38
 */
public class MyServletRequestListener implements ServletRequestListener {


    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        // 监听ServletRequest的销毁
        System.out.println("监听ServletRequest的销毁....");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        // 监听Servlet的初始化
        System.out.println("监听ServletRequest的初始化....");
    }
}
