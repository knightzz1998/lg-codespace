package cn.knightzz.mapper;

import cn.knightzz.entity.Account;
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
 * @title: AccountDaoTest
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 12:35
 */
public class AccountMapperTest {


    @Test
    public void findAll() throws IOException {
        // 加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accountList = mapper.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }

        sqlSession.close();
    }
}