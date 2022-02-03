package cn.knightzz;

import cn.knightzz.config.SpringConfig;
import cn.knightzz.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author 王天赐
 * @title: App
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/25 13:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class App {

    @Resource
    AccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer("tom", "jerry", 10d);
    }
}
