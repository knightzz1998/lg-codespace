package cn.knightzz.entity;

import java.util.Date;

/**
 * @author 王天赐
 * @title: Oder
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 11:19
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
     * 订单所属的用户信息
     */
    private User user;


    @Override
    public String toString() {
        return "Oder{" +
                "id=" + id +
                ", orderTime=" + orderTime +
                ", money=" + money +
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
