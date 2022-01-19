package cn.knightzz.mapper;

import cn.knightzz.entity.Order;

import java.util.List;

/**
 * @author 王天赐
 * @title: OrderMapper
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 11:24
 */
public interface OrderMapper {

    /**
     * 查询订单信息以及订单对应的用户信息
     * @return
     */
    public List<Order> findAllWithUser();


}
