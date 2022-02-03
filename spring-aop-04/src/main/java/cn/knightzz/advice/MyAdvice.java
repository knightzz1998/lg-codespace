package cn.knightzz.advice;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 王天赐
 * @title: MyAdvice
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/26 14:34
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(public void cn.knightzz.service.impl.AccountServiceImpl.transfer())")
    public void myServicePoint(){}

    /**
     * 访问修饰符可以省略
     * 返回值类型、包名、类名、方法名可以使用星号 * 代替，代表任意
     * 两个点 .. 表示当前包及其子包下的类
     * 参数列表可以使用两个点 .. 表示任意个数，任意类型的参数列表
     *
     * 第一个 * 表示 任意类型
     * 第二个 * 表示 knightzz 包以及其子包下的所有的类
     * 第三个 * 表示 任意方法
     */
    @Pointcut("execution(* cn.knightzz..*.*(..))")
    public void myPoint(){}

    /**
     * 切入点抽取
     */
    @Before("MyAdvice.myServicePoint()")
    public void before(){
        System.out.println("开始前置通知 ... ");
    }
}
