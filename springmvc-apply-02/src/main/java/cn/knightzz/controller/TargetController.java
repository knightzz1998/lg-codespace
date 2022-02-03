package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王天赐
 * @title: TargetController
 * @projectName springmvc-apply-02
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 22:15
 */
@Controller
public class TargetController {

    @RequestMapping("/target")
    public String targetMethod() {
        System.out.println("target 执行...");
        return "success";
    }
}
