package cn.knightzz.entity;

import java.util.Date;

/**
 * @author 王天赐
 * @title: Order
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 19:22
 */
public class Order {
    /**
     * 订单id
     */
    private Integer id;

    /**
     * 订单时间
     */
    private Date orderTime;

    /**
     * 金额
     */
    private double money;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 订单所属的用户信息
     */
    private User user;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderTime=" + orderTime +
                ", money=" + money +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
