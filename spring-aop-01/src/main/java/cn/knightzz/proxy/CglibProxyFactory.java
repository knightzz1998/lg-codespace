package cn.knightzz.proxy;

import cn.knightzz.service.AccountService;
import cn.knightzz.utils.TransactionManager;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王天赐
 * @title: CglibProxyFactory
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 22:05
 */
@Component
public class CglibProxyFactory {
    @Resource
    AccountService accountService;

    @Resource
    TransactionManager transactionManager;

    public AccountService createAccountServiceJdkProxy(){

        AccountService accountServiceProxy = null;

       accountServiceProxy = (AccountService) Enhancer.create(accountService.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result = null;
                try {
                    // 1. 开启事务
                    transactionManager.beginTransaction();
                    // 2. 处理业务
                    result = method.invoke(accountService, objects);
                    // 3. 提交事务
                    transactionManager.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                    transactionManager.rollBack();
                } finally {
                    transactionManager.release();
                }
                return result;
            }
        });

       return accountServiceProxy;
    }
}
