package cn.knightzz.mapper;

import cn.knightzz.entity.Account;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountDao
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 11:28
 */
public interface AccountMapper {

    /**
     * 查找所有账户信息
     * @return
     */
    public List<Account> findAll();
}
