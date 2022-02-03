package cn.knightzz.utils;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 王天赐
 * @title: ConnectionUtils
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 13:36
 */
@Component
public class ConnectionUtils {

    /**
     * 待绑定的线程
     */
    private ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    /**
     * 数据库连接源
     */
    @Resource
    DataSource dataSource;

    public Connection getThreadConnection(){

        // 1. 先从ThreadLocal获取连接, 如果获取不到再从数据库连接池中获取
        Connection connection = threadLocal.get();
        // 2. 从连接池中获取数据
        if (connection == null) {
            try {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * 解除绑定
     */
    public void removeThreadConnection(){
        threadLocal.remove();
    }
}
