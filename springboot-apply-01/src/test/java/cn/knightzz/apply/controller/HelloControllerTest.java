package cn.knightzz.apply.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * SpringJUnit4ClassRunner.class:Spring运行环境
 * JUnit4.class:JUnit运行环境
 * SpringRunner.class:Spring Boot运行环境
 * @RunWith(SpringRunner.class) : @RunWith:运行器
 * @SpringBootTest : 标记为当前类为SpringBoot测试类，加载项目的ApplicationContext上下文环境
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class HelloControllerTest {

    @Autowired
    HelloController helloController;

    @Test
    void hello() {
        String hello = helloController.hello();
        System.out.println(hello);
    }
}