package cn.knightzz.factory;

import cn.knightzz.dao.UserDao;
import cn.knightzz.dao.impl.UserDaoImpl;

/**
 * @author 王天赐
 * @title: DynamicFactoryBean
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 21:21
 */
public class DynamicFactoryBean {
    public UserDao createUserDao(){
        return new UserDaoImpl();
    }
}
