package cn.knightzz.dao;

import cn.knightzz.entity.Account;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountDao
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 13:26
 */
public interface AccountDao {

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

    /**
     * 转出操作
     * @param outUser
     * @param money
     */
    public void out(String outUser, Double money);


    /**
     * 转入操作
     * @param inUser
     * @param money
     */
    public void in(String inUser, Double money);
}
