package cn.knightzz.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author 王天赐
 * @title: MyHttpSessionAttributeListener
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/13 20:45
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("监听 Session 添加 Attribute");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("监听 Session 移除 Attribute");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("监听 Session 添加 Attribute");
    }
}
