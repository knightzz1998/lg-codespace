package cn.knightzz.controller;

import cn.knightzz.entity.Account;
import cn.knightzz.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王天赐
 * @title: AccountController
 * @projectName ssm-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/3 18:10
 */
@Controller
public class AccountController {

    @Resource
    AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accountList = accountService.findAll();
        System.out.println(accountList);
        model.addAttribute("list", accountList);
        return "list";
    }
}
