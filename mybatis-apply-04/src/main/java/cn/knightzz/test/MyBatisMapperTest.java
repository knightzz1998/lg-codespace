package cn.knightzz.test;

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
 * @title: MyBatisMapperTest
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/17 18:51
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
    public void saveUser() {

        user.setUsername("KKK");
        user.setSex("男");
        user.setBirthday(new Date());
        user.setAddress("河南");
        mapper.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void saveUserBySelectKey() {

        user.setUsername("KKK222");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("河南");
        mapper.saveUserBySelectKey(user);
        System.out.println(user);
    }

    @Test
    public void findUserByIdAndUsernameIf() {
        user.setUsername("KKK222");
        User userByIdAndUsernameIf = mapper.findUserByIdAndUsernameIf(user);
        System.out.println(userByIdAndUsernameIf);
    }

    @Test
    public void updateUserBySet() {
        user.setId(1);
        user.setUsername("KKK222");
        mapper.updateUserBySet(user);
    }

    @Test
    public void findAllUserById() {

        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(2024);

        List<User> userList = mapper.findAllUserById(ids);
        for (User user1 : userList) {
            System.out.println(user1);
        }
    }

    @Test
    public void pageHelper() {

        // 设置分页参数 :
        // pageNum : 当前页码
        // pageSize: 每页显示的数据条数
        PageHelper.startPage(2, 2);
        List<User> allUsers = mapper.findAll();

        for (User allUser : allUsers) {
            System.out.println(allUser);
        }

        PageInfo<User> pageInfo = new PageInfo<User>(allUsers);
        System.out.println("总条数：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("当前页：" + pageInfo.getPageNum());
        System.out.println("每页显示长度：" + pageInfo.getPageSize());
        System.out.println("是否第一页：" + pageInfo.isIsFirstPage());
        System.out.println("是否最后一页：" + pageInfo.isIsLastPage());
    }

    @Test
    public void findAllWithUser(){
        List<Order> allWithUsers = orderMapper.findAllWithUser();
        for (Order allWithUser : allWithUsers) {
            System.out.println(allWithUser);
        }
    }

    @Test
    public void findAllWithOrder(){
        List<User> allWithOrders = mapper.findAllWithOrder();
        for (User allWithOrder : allWithOrders) {
            System.out.println(allWithOrder);
        }
    }

    @Test
    public void findAllWithRole(){
        List<User> allWithRoles = mapper.findAllWithRole();
        for (User allWithRole : allWithRoles) {
            System.out.println(allWithRole);
        }
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
