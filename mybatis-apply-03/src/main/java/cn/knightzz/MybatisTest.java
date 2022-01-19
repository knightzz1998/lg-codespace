package cn.knightzz;


import cn.knightzz.entity.User;
import cn.knightzz.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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

    
    @Test
    public void findUserById() throws IOException {

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        // 开启自动提交
        SqlSession sqlSession = factory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findUserByName() throws IOException {

        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        // 开启自动提交
        SqlSession sqlSession = factory.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserByName("%应%");
        System.out.println(user);
        sqlSession.close();
    }
}
