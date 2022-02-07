package cn.knightzz.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 王天赐
 * @title: LoginController
 * @projectName springboot-apply-thymeleaf
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 15:20
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model){
        String username = (String) model.getAttribute("username");
        String password = (String) model.getAttribute("password");
        model.addAttribute("message", "登陆成功");
        // 中间不要有空格
        return "redirect:/article/findAll";
    }
}
