package cn.knightzz.test;

import cn.knightzz.entity.User;
import cn.knightzz.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 王天赐
 * @title: MyBatisMapperTest
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/20 17:27
 */
public class MyBatisMapperTest {

    private User user = new User();
    private SqlSession sqlSession;
    private UserMapper mapper;

    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        sqlSession = build.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void userMapperTest(){

        List<User> users = mapper.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
