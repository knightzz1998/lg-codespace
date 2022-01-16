package cn.knightzz.mapper;

import cn.knightzz.entity.User;

import java.util.List;

/**
 * @author 王天赐
 * @title: UserMapper
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/16 21:23
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id 用户id
     * @return
     */
    public List<User> findUserById(int id);
}
