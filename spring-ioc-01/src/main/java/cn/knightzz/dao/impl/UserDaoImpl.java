package cn.knightzz.dao.impl;

import cn.knightzz.dao.UserDao;

/**
 * @author 王天赐
 * @title: UserDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 19:20
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("User Save ... ");
    }

    @Override
    public void init() {
        System.out.println("UserDaoImpl init ... ");
    }

    @Override
    public void destroy() {
        System.out.println("UserDaoImpl destroy ... ");
    }
}
