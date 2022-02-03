package cn.knightzz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 王天赐
 * @title: SpringConfig
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 14:24
 */
@Configuration
@ComponentScan("cn.knightzz")
@EnableAspectJAutoProxy
@EnableTransactionManagement
@Import(DataSourceConfig.class)
public class SpringConfig {

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Autowired DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean("transactionManager")
    public DataSourceTransactionManager getDataSourceTransactionManager(@Autowired DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
