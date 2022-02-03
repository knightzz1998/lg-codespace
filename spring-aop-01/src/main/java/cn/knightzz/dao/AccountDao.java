package cn.knightzz.dao;

/**
 * @author 王天赐
 * @title: AccountDao
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 12:31
 */
public interface AccountDao {

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
