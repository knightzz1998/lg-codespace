package cn.knightzz.mapper;

import cn.knightzz.entity.User;

/**
 * @author 王天赐
 * @title: UserMapper
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 18:42
 */
public interface UserMapper {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public User findUserById(Integer id);
}
