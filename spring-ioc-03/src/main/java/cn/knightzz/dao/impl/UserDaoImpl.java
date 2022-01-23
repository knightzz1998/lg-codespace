package cn.knightzz.dao.impl;

import cn.knightzz.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 王天赐
 * @title: UserDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/22 22:21
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl saveUser ...");
    }
}
