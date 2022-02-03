package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王天赐
 * @title: TestController
 * @projectName springmvc-apply-02
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 21:47
 */
@Controller
public class TestController {

    @RequestMapping("/testException")
    public String testException() {
        int i = 1 / 0; return "success";
    }
}
