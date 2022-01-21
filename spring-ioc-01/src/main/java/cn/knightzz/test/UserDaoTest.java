package cn.knightzz.test;

import cn.knightzz.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 王天赐
 * @title: UserTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 19:27
 */
public class UserDaoTest {

    @Test
    public void userDaoTest(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        System.out.println("开始获取 Bean ");
        // 从容器中获取 Bean
        UserDao  userDao = (UserDao) applicationContext.getBean("UserDao");
        userDao.saveUser();

        System.out.println("开始销毁");
        applicationContext.destroy();
    }
}
