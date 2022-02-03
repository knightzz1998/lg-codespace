package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author 王天赐
 * @title: SessionController
 * @projectName springmvc-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 16:22
 */
@Controller
@SessionAttributes("username")
public class SessionController {
    // @SessionAttributes("username") 向request域存入的key为username时，同步到session域中

    @RequestMapping("/forward2")
    public String forward(Model model) {
        // 添加到 request 域中
        model.addAttribute("username", "SessionAttributes");
        return "forward:/pages/result.jsp";
    }

    @RequestMapping("/returnString2")
    public String returnString() {
        return "result";
    }
}
