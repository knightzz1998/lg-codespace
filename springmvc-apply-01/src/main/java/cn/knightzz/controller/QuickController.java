package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王天赐
 * @title: QuickController
 * @projectName springmvc-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/1 20:14
 */
@Controller
public class QuickController {

    @RequestMapping("/quick")
    public String quick(){
        System.out.println("quick running .... ");
        return "pages/success.jsp";
    }
}
