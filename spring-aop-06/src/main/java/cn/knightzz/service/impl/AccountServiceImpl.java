package cn.knightzz.service.impl;

import cn.knightzz.dao.AccountDao;
import cn.knightzz.entity.Account;
import cn.knightzz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王天赐
 * @title: AccountServiceImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 14:19
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountDao accountDao;

    @Resource
    private PlatformTransactionManager transactionManager;

    /**
     * 转账操作
     *
     * @param outUser
     * @param inUser
     * @param money
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = -1, readOnly = false)
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        accountDao.out(outUser, money);
        int i = 1 / 0;
        accountDao.in(inUser, money);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer id) {
        accountDao.delete(id);
    }
}
