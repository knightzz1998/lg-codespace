package cn.knightzz.service;

import cn.knightzz.entity.Account;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountService
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 14:18
 */
public interface AccountService {

    /**
     * 转账操作
     * @param outUser
     * @param inUser
     * @param money
     */
    public void transfer(String outUser, String inUser, Double money);

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据id查询账户
     * @param id
     * @return
     */
    public Account findById(Integer id);

    /**
     * 添加账户信息
     * @param account
     */
    public void save(Account account);

    /**
     * 更新账户信息
     * @param account
     */
    public void update(Account account);

    /**
     * 删除账户信息
     * @param id
     */
    public void delete(Integer id);


}