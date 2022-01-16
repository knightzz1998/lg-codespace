package cn.knightzz.test;

import cn.knightzz.entity.User;
import cn.knightzz.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author 王天赐
 * @title: MyBatisProxyTest
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/16 20:09
 */
public class MyBatisProxyTest {

    @Test
    public void findAll() throws IOException {

        // 加载核心配置
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        // 获取sqlSessionFactory工厂类
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        // 获取session对象, 开启自动事务提交
        SqlSession sqlSession = factory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user : mapper.findAll()) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
