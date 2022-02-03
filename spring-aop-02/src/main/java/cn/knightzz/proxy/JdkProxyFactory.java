package cn.knightzz.proxy;

import cn.knightzz.service.AccountService;
import cn.knightzz.utils.TransactionManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 王天赐
 * @title: JdkProxyFactory
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 20:13
 */
@Component
public class JdkProxyFactory {

    @Resource
    AccountService accountService;

    @Resource
    TransactionManager transactionManager;


    /**
     * ClassLoader :  类加载器, 借助被代理的对象获取 ClassLoader
     * Interfaces : 被代理类的
     * InvocationHandler : 代理对象
     * @exception : InvocationTargetException异常由Method.invoke(obj, args...)方法抛出。当被调用的方法的内部抛出了异常而没有被捕获时，将由此异常接收！！！
     * @return
     */
    public AccountService createAccountServiceJdkProxy(){

        AccountService accountServiceProxy = null;

        // 使用JDK的代理类创建实例
        // 基于接口的动态代理技术·：利用拦截器（必须实现invocationHandler）加上反射机制生成
        // 一个代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理，从而实现方法增强
        accountServiceProxy = (AccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(), new InvocationHandler() {

                    // 1. proxy 当前代理对象引用
                    // 2. method 被调用的目标方法的引用

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;
                        try {
                            // 开启事务
                            transactionManager.beginTransaction();
                            result = method.invoke(accountService, args);
                            // 提交事务
                            transactionManager.commit();
                        } catch (Exception e) {
                            e.printStackTrace();
                            // 回滚事务
                            transactionManager.rollBack();
                        } finally {
                            // 释放资源
                            transactionManager.release();
                        }
                            return result;
                    }
                });
        return accountServiceProxy;
    }
}
