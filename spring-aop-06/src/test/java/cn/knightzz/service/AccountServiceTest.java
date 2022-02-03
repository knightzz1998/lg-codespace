package cn.knightzz.service;

import cn.knightzz.config.SpringConfig;
import cn.knightzz.entity.Account;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author 王天赐
 * @title: AccountServiceTest
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/27 14:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest extends TestCase {

    @Resource
    AccountService accountService;

    @Test
    public void testFindAll() {
        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindById() {
        Account account = accountService.findById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account accout = new Account();
        accout.setId(3);
        accout.setName("kiss");
        accout.setMoney(300d);
        accountService.save(accout);
    }

    @Test
    public void testUpdate() {
        Account accout = new Account();
        accout.setId(3);
        accout.setName("knightzz");
        accout.setMoney(400d);
        accountService.update(accout);
    }

    public void testDelete() {
    }

    @Test
    public void transfer() {
        testFindAll();
        accountService.transfer("tom", "jerry", 10d);
        testFindAll();
    }
}