package cn.knightzz.config;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author 王天赐
 * @title: SpringConfig
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 13:01
 */
@Configuration
@ComponentScan("cn.knightzz")
@EnableAspectJAutoProxy
@Import(DataSourceConfig.class)
public class SpringConfig {

    @Bean("queryRunner")
    public QueryRunner getQueryRunner(@Autowired DataSource dataSource){
        return new QueryRunner(dataSource);
    }
}
