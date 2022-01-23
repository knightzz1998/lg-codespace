package cn.knightzz.test;

import cn.knightzz.config.SpringConfig;
import cn.knightzz.service.UserService;
import cn.knightzz.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * @author 王天赐
 * @title: AnnotationTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 14:16
 */
public class AnnotationTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean(UserService.class);

    @Test
    public void resourceTest(){
        String username = userService.getUsername();
        System.out.println(username);
        userService.saveUser();
    }
}
