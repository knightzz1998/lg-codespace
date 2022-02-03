package cn.knightzz.service;

import cn.knightzz.entity.Account;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountService
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 16:30
 */
public interface AccountService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<Account> findAll();
}
