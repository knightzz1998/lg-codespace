package cn.knightzz.utils;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * @author 王天赐
 * @title: TransactionManager
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 19:00
 */
@Component
public class TransactionManager {

    @Resource
    private ConnectionUtils connectionUtils;

    /**
     * 开启事务
     */
    public void beginTransaction(){
        // 关闭自动提交事务
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 回滚事务
     */
    public void rollBack(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 释放资源
     */
    public void release(){

        try {
            // 改回自动提交事务
            connectionUtils.getThreadConnection().setAutoCommit(true);
            // 将数据库连接归还到连接池
            connectionUtils.getThreadConnection().close();
            // 解除线程绑定
            connectionUtils.removeThreadConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
