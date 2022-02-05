package cn.knightzz.apply.entity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: StudentTest
 * @projectName springboot-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/5 22:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentTest {

    @Autowired
    Student student;

    @Test
    void personTest(){
        System.out.println(student);
    }

}