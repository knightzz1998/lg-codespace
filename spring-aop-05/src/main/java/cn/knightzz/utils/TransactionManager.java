package cn.knightzz.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
@Aspect
public class TransactionManager {

    @Resource
    private ConnectionUtils connectionUtils;

    @Around("execution(* cn.knightzz.service..*.*(..))")
    public Object around(ProceedingJoinPoint pjp){
        Object result = null;

        try {
            // 开启事务
            connectionUtils.getThreadConnection().setAutoCommit(false);
            // 业务逻辑
            pjp.proceed();
            // 提交事务
            connectionUtils.getThreadConnection().commit();
        } catch (Throwable e) {
            e.printStackTrace();
            try {
                // 回滚事务
                connectionUtils.getThreadConnection().rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }finally {
            try {
                // 设置自动提交
                connectionUtils.getThreadConnection().setAutoCommit(true);
                // 将数据库连接释放到连接池
                connectionUtils.getThreadConnection().close();
                // 解除线程绑定
                connectionUtils.removeThreadConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
