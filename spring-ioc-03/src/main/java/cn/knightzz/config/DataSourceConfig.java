package cn.knightzz.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 王天赐
 * @title: DataBaseConfig
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 19:47
 */
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfig {

    @Value("${jdbc.username}")
    private String username;


    @Bean("dataSource")
    public DataSource getDataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setUsername(username);
        System.out.println("DataSourceConfig : " + dataSource.getUsername());
        return dataSource;
    }

}
