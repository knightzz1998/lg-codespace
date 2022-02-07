package cn.knightzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author knightzz98
 */
@SpringBootApplication
@MapperScan("cn.knightzz.mapper")
public class SpringbootApplyDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplyDataApplication.class, args);
    }

}
