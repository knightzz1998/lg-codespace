package cn.knightzz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 王天赐
 * @title: SpringConfig
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/26 15:37
 */
@Configuration
@ComponentScan("cn.knightzz")
@EnableAspectJAutoProxy
public class SpringConfig {
}
