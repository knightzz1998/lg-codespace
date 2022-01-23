package cn.knightzz.test;

import cn.knightzz.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王天赐
 * @title: UserServiceTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 21:34
 */
public class UserServiceTest {

    @Test
    public void userDaoTest(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println("开始获取 Bean ");
        // 从容器中获取 Bean
        UserService userService = (UserService) applicationContext.getBean("UserService");

        userService.save();

        System.out.println("开始销毁");
        applicationContext.destroy();
    }
}
