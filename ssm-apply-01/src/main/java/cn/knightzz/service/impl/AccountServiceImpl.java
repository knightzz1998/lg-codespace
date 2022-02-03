package cn.knightzz.service.impl;

import cn.knightzz.entity.Account;
import cn.knightzz.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountServiceImpl
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 16:47
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Override
    public List<Account> findAll() {
        return null;
    }
}
