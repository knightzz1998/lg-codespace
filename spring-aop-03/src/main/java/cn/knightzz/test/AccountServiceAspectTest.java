package cn.knightzz.test;

import cn.knightzz.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 王天赐
 * @title: AccountServiceAspectTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/26 14:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-context.xml")
public class AccountServiceAspectTest {

    @Autowired
    AccountService accountService;

    @Test
    public void beforeAspectTest(){
        accountService.transfer();
    }

}
