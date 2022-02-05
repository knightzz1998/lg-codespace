package cn.knightzz.apply.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: PersonTest
 * @projectName springboot-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/4 10:58
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class PersonTest {

    @Autowired
    Person person;

    @Test
    void personTest(){
        System.out.println(person);
    }

}