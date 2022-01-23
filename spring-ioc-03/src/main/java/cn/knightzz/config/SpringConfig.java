package cn.knightzz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 王天赐
 * @title: SpringConfig
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 19:45
 */
@Configuration
@ComponentScan("cn.knightzz")
@Import(DataSourceConfig.class)
public class SpringConfig {

    /**
     * 自动注入 dataSource
     *
     * @param dataSource
     * @return
     */
    @Bean
    public QueryRunner getDataBaseConfig(@Autowired DataSourceConfig dataSource){

        // 需要注意的是 DataSourceConfig 并没有被设置为Bean, 所以需要手动引入 @Import(DataSourceConfig.class)
        // 才可以自动注入
        DataSource source = dataSource.getDataSource();
        String username = source.getUsername();
        System.out.println("加载 username : " + username);
        return new QueryRunner();
    }
}
