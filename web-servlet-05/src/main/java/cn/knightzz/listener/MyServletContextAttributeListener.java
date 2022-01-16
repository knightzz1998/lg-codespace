package cn.knightzz.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author 王天赐
 * @title: MyServletContextAttributeListener
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/14 16:22
 */
public class MyServletContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("监听 Servlet Context 属性添加");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("监听 Servlet Context 属性移除");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("监听 Servlet Context 属性替换");
    }
}
