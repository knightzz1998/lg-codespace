package cn.knightzz;


import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 王天赐
 * @title: MybatisTest
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/16 21:32
 */
public class MybatisTest {

    public void findUserById() throws IOException {

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
    }
}
