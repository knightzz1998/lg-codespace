package cn.knightzz.dao;

/**
 * @author 王天赐
 * @title: UserDao
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 19:18
 */
public interface UserDao {

    /**
     * 保存用户
     */
    void saveUser();

    /**
     * 初始化方法
     */
    void init();

    /**
     * 实例销毁
     */
    void destroy();
}
