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
 * @date 2022/1/16 20:06
 */
public interface UserMapper {

    /**
     * 查询所有数据
     * @return
     */
    public List<User> findAll();
}
