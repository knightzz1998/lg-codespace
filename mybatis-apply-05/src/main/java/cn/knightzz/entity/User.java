package cn.knightzz.entity;

import java.util.Date;
import java.util.List;

/**
 * @author 王天赐
 * @title: User
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/19 18:41
 */
public class User {
    private Integer id;

    private String username;

    private Date birthday;

    private String sex;

    private String address;

    private List<Order> orderList;

    /**
     * 表示的当前用户关联的角色列表
     */
    private List<SysRole> roleList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                ", roleList=" + roleList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
}
