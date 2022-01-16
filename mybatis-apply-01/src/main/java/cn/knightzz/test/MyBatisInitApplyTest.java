package cn.knightzz.test;

import cn.knightzz.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author 王天赐
 * @title: MyBatisInitApply
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/15 22:29
 */
public class MyBatisInitApplyTest {


    private SqlSessionFactory getSqlSessionFactory() throws IOException {
        // 1. 加载核心配置文件
        InputStream stream = Resources.getResourceAsStream("sqlMapConfig.xml");

        // 2. 获取 sqlSessionFactory 工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        return factory;
    }

    @Test
    public void findAll() throws IOException {

        // 1. 加载核心配置文件
        SqlSessionFactory factory = getSqlSessionFactory();

        // 3. 获取 sqlSession 会话对象
        SqlSession sqlSession = factory.openSession();

        // 4. 执行 sql, 根据 namespace.id 从映射文件中获取 SQL
        List<User> userList = sqlSession.selectList("UserMapper.findAll");

        // 5. 遍历打印结果
        for (User user : userList) {
            System.out.println(user);
        }

        // 6. 关闭资源
        sqlSession.close();
    }

    @Test
    public void saveUser() throws IOException {

        SqlSessionFactory factory = getSqlSessionFactory();

        // 3. 获取 sqlSession 会话对象
        SqlSession sqlSession = factory.openSession();

        // 4. 执行 sql, 根据 namespace.id 从映射文件中获取 SQL

        User user = new User();
        user.setId(2021);
        user.setUsername("TOM");
        user.setBirthday(new Date());
        user.setAddress("武汉");

        int insert = sqlSession.insert("UserMapper.saveUser", user);

        System.out.println("insert " + (insert == 0 ? "failed" : "success"));

        // 由于增删改操作都会影响数据库中数据的状态, 所以我们需要
        // 手动设置事务
        sqlSession.commit();

        // 6. 关闭资源
        sqlSession.close();
    }

    @Test
    public void updateUser() throws IOException {

        SqlSessionFactory factory = getSqlSessionFactory();

        // 3. 获取 sqlSession 会话对象
        SqlSession sqlSession = factory.openSession();

        // 4. 执行 sql, 根据 namespace.id 从映射文件中获取 SQL
        User user = new User();
        user.setId(2021);
        user.setUsername("TOM");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("武汉");

        int insert = sqlSession.update("UserMapper.updateUser", user);

        System.out.println("update " + (insert == 0 ? "failed" : "success"));

        // 由于增删改操作都会影响数据库中数据的状态, 所以我们需要
        // 手动设置事务
        sqlSession.commit();

        // 6. 关闭资源
        sqlSession.close();
    }

    @Test
    public void deleteUser() throws IOException {

        SqlSessionFactory factory = getSqlSessionFactory();

        // 3. 获取 sqlSession 会话对象
        SqlSession sqlSession = factory.openSession();

        // 4. 执行 sql, 根据 namespace.id 从映射文件中获取 SQL
        int insert = sqlSession.delete("UserMapper.deleteUser", 2021);

        System.out.println("delete " + (insert == 0 ? "failed" : "success"));

        // 由于增删改操作都会影响数据库中数据的状态, 所以我们需要
        // 手动设置事务
        sqlSession.commit();

        // 6. 关闭资源
        sqlSession.close();
    }


}
