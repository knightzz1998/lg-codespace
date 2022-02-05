package cn.knightzz.apply.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: MyPropertiesTest
 * @projectName springboot-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/5 22:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class MyPropertiesTest {

    @Autowired
    MyProperties myProperties;

    @Test
    public void test(){
        System.out.println(myProperties);
    }
}