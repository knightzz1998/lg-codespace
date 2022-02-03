package cn.knightzz.controller;

import cn.knightzz.entity.Account;
import cn.knightzz.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王天赐
 * @title: TestController
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 17:56
 */
@Controller
public class TestController {

    @Resource
    AccountService accountService;

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

    @RequestMapping("/findAl222")
    public String findAll(){
        List<Account> accountList = accountService.findAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
        return "success";
    }
}
