package cn.knightzz.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * @author 王天赐
 * @title: MyServletRequestAttributeListener
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/13 11:37
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("监听 " + name + " 属性的增加...");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("监听 " + name + " 属性的移除...");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        System.out.println("监听 " + name + " 属性的替换...");
    }
}
