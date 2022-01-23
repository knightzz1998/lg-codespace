package cn.knightzz.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author 王天赐
 * @title: SpringApiTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 19:52
 */
public class SpringApiTest {

    @Test
    public void apiTest(){

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
    }
}
