package cn.knightzz.apply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动类通常放在二级包中，比如：com.lagou.SpringBootDemo1Application
 * 因为SpringBoot项目在做包扫描，会扫描启动类所在的包及其子包下的所有内容。
 * @SpringBootApplication 标识当前类为SpringBoot项目的启动类
 * @author 王天赐
 */
@SpringBootApplication
public class SpringbootApplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplyApplication.class, args);
    }

}
