package cn.knightzz.dao.impl;

import cn.knightzz.dao.AccountDao;
import cn.knightzz.entity.Account;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王天赐
 * @title: AccountDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 14:07
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Account> findAll() {

        String sql = "select * from account";
        List<Account> accountList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Account.class));
        return accountList;
    }

    @Override
    public Account findById(Integer id) {

        String sql = "select * from account where id = ?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
        return account;
    }

    @Override
    public void save(Account account) {
        String sql = "insert into account(id, name ,money) values(null ,  ?,  ?)";
        jdbcTemplate.update(sql, account.getName(), account.getMoney());
    }

    @Override
    public void update(Account account) {
        String sql = "update account set name = ?, money = ? where id = ?";
        jdbcTemplate.update(sql, account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from account where id = ?";
        jdbcTemplate.update(sql, id);
    }

    /**
     * 转出操作
     *
     * @param outUser
     * @param money
     */
    @Override
    public void out(String outUser, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        jdbcTemplate.update(sql, money, outUser);
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
        jdbcTemplate.update(sql, money, inUser);
    }
}
