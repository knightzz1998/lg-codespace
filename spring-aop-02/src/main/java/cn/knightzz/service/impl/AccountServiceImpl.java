package cn.knightzz.service.impl;

import cn.knightzz.dao.AccountDao;
import cn.knightzz.service.AccountService;
import cn.knightzz.utils.TransactionManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 王天赐
 * @title: AccountServiceImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 12:43
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;


    @Resource
    private TransactionManager transactionManager;

    @Override
    public void transfer(String outUser, String inUser, Double money) {
        // 开启事务
        accountDao.out(outUser, money);
        // 模拟异常情况
        int i = 1 / 0;
        accountDao.in(inUser, money);

    }
}
