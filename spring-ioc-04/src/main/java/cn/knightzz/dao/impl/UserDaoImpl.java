package cn.knightzz.dao.impl;

import cn.knightzz.dao.UserDao;
import cn.knightzz.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 王天赐
 * @title: AccountDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 21:34
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource
    private QueryRunner queryRunner;

    @Override
    public List<User> findAll() {
        List<User> userList = null;
        String sql = "select * from user";
        try {
            userList = queryRunner.query(sql, new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
