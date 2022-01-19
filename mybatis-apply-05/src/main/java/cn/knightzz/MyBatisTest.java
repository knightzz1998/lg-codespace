package cn.knightzz;

import cn.knightzz.entity.Order;
import cn.knightzz.entity.User;
import cn.knightzz.mapper.OrderMapper;
import cn.knightzz.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 王天赐
 * @title: MyBatisTest
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 20:58
 */
public class MyBatisTest {
    private User user = new User();
    private SqlSession sqlSession;
    private UserMapper mapper;
    private OrderMapper orderMapper;

    @Before
    public void init() throws IOException {
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        sqlSession = build.openSession(true);
        mapper = sqlSession.getMapper(UserMapper.class);
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }

    @Test
    public void findUserById(){
        User userById = mapper.findUserById(1);
        System.out.println(userById);
    }

    @Test
    public void findAllWithUser(){
        List<Order> allWithUsers = orderMapper.findAllWithUser();
        for (Order allWithUser : allWithUsers) {
            System.out.println(allWithUser);
        }
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
