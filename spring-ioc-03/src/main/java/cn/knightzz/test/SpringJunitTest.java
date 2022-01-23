package cn.knightzz.test;

import cn.knightzz.config.SpringConfig;
import cn.knightzz.service.UserService;
import cn.knightzz.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 王天赐
 * @title: SpringJunitTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 21:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
// @ContextConfiguration(value = {"classpath:applicationContext.xml"}) 加载spring 核心配置文件
@ContextConfiguration(classes = {SpringConfig.class}) // 加载spring核心配置类
public class SpringJunitTest {

    @Autowired
    UserService userService;

    @Test
    public void testSpringJunit(){
        userService.saveUser();
    }

}
