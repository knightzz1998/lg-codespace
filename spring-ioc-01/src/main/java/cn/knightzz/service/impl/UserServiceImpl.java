package cn.knightzz.service.impl;

import cn.knightzz.dao.UserDao;
import cn.knightzz.service.UserService;

/**
 * @author 王天赐
 * @title: UserServiceImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 21:31
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl save ... ");
        userDao.saveUser();
    }
}
