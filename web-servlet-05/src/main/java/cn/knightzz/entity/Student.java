package cn.knightzz.entity;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * @author 王天赐
 * @title: Student
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/15 10:16
 */
public class Student implements Serializable, HttpSessionActivationListener {

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
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println(" 将Session信息保存到本地 ... ");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println(" 将Session文件从本地读取到内存中 ... ");
    }
}
