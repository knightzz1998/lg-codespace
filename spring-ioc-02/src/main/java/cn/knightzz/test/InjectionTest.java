package cn.knightzz.test;

import cn.knightzz.dao.UserDao;
import cn.knightzz.entity.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王天赐
 * @title: InjectionTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/22 13:38
 */
public class InjectionTest {

    /**
     * 普通属性注入
     */
    @Test
    public void propertyInjection(){

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void listInjection(){

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");
       UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        System.out.println(userDao);
    }
}
