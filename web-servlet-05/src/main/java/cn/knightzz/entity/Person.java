package cn.knightzz.entity;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @author 王天赐
 * @title: Person
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/14 17:23
 */
public class Person implements HttpSessionBindingListener {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("监听 Session 对象 绑定");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("监听 Session 对象 解绑定");
    }
}
