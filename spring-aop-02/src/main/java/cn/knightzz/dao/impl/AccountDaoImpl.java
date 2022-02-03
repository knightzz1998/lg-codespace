package cn.knightzz.dao.impl;

import cn.knightzz.dao.AccountDao;
import cn.knightzz.utils.ConnectionUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @author 王天赐
 * @title: AccountDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 12:33
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource
    private QueryRunner queryRunner;

    @Resource
    private ConnectionUtils connectionUtils;

    /**
     * 转出操作
     *
     * @param outUser
     * @param money
     */
    @Override
    public void out(String outUser, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        try {
            // 手动传入数据库连接
            queryRunner.update(connectionUtils.getThreadConnection() , sql, money, outUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 转入操作
     *
     * @param inUser
     * @param money
     */
    @Override
    public void in(String inUser, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        try {
            queryRunner.update(connectionUtils.getThreadConnection(),sql, money, inUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
