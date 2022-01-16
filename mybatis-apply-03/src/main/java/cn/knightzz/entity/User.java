package cn.knightzz.entity;

import java.util.Date;

/**
 * @author 王天赐
 * @title: User
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/15 22:00
 */
public class User {
    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户名称
     */
    private String usernameABC;

    /**
     * 用户生日
     */
    private Date birthdayABC;

    /**
     * 性别
     */
    private String sexABC;

    /**
     * 地址
     */
    private String addressABC;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", usernameABC='" + usernameABC + '\'' +
                ", birthdayABC=" + birthdayABC +
                ", sexABC='" + sexABC + '\'' +
                ", addressABC='" + addressABC + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsernameABC() {
        return usernameABC;
    }

    public void setUsernameABC(String usernameABC) {
        this.usernameABC = usernameABC;
    }

    public Date getBirthdayABC() {
        return birthdayABC;
    }

    public void setBirthdayABC(Date birthdayABC) {
        this.birthdayABC = birthdayABC;
    }

    public String getSexABC() {
        return sexABC;
    }

    public void setSexABC(String sexABC) {
        this.sexABC = sexABC;
    }

    public String getAddressABC() {
        return addressABC;
    }

    public void setAddressABC(String addressABC) {
        this.addressABC = addressABC;
    }
}
