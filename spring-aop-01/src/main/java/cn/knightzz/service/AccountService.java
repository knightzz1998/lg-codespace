package cn.knightzz.service;

/**
 * @author 王天赐
 * @title: Account
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 12:43
 */
public interface AccountService {

    /**
     * 转账操作
     * @param outUser
     * @param inUser
     * @param money
     */
    public void transfer(String outUser, String inUser, Double money);
}
