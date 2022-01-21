package cn.knightzz.test;

import cn.knightzz.entity.Order;
import cn.knightzz.entity.User;
import cn.knightzz.mapper.OrderMapper;
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
import java.util.Date;
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
    public void findAllTest(){
        List<User> users = mapper.findAll();
        for (User user1 : users) {
            System.out.println(user1);
        }
    }

    @Test
    public void updateUserTest(){
        user.setId(1);
        user.setUsername("卡莎");
        user.setBirthday(new Date());
        user.setAddress("湖北武汉");
        mapper.updateUser(user);
    }

    @Test
    public void deleteUserTest(){
        mapper.deleteUser(2024);
    }

    @Test
    public void findAllWithOrder(){
        List<User> allWithOrders = mapper.findAllWithOrder();
        for (User allWithOrder : allWithOrders) {
            System.out.println(allWithOrder);
        }
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
