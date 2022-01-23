package cn.knightzz.dao;

import cn.knightzz.entity.User;

import java.util.List;

/**
 * @author 王天赐
 * @title: AccountDao
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 21:33
 */
public interface UserDao {


    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAll();
}
