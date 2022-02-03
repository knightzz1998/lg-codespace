package cn.knightzz.controller;

import cn.knightzz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author 王天赐
 * @title: UserController
 * @projectName springmvc-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/1 21:35
 */
@Controller
public class ParamController {

    @RequestMapping("/simpleParam")
    public String simpleParam(Integer id, String username) {
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/entityParam")
    public String simpleParam(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(Integer[] ids) {
        for (Integer id : ids) {
            System.out.println(id);
        }
        return "success";
    }

    @RequestMapping("/converterParam")
    public String converterParam(Date birthday) {
        // 注意 birthday 需要和请求的name值一致, 否则无法获取到数据
        System.out.println("converterParam  => ");
        System.out.println(birthday);
        return "success";
    }


    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(name = "id", defaultValue = "1", required = false) Integer uid,
                               @RequestParam("username") String name) {
        // @RequestParam() 注解 defaultValue 设置参数默认值 name 匹配页面传递参数的名称
        // required 设置是否必须传递参数，默认值为true；如果设置了默认值，值自动改为false
        System.out.println("uid = " + uid);
        System.out.println("name = " + name);
        return "success";
    }

    @RequestMapping("/requestHead")
    public String requestHead(@RequestHeader("cookie") String cookie) {
        System.out.println(cookie);
        return "success";
    }

    @RequestMapping("/cookieValue")
    public String cookieValue(@CookieValue("JSESSIONID") String jesessionId) {
        System.out.println(jesessionId);
        return "success";
    }

    @RequestMapping("/servletAPI")
    public String servletAPI(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }

    @RequestMapping("/forward")
    public String forward(Model model) {
        model.addAttribute("username", "root");
        return "forward:/pages/success.jsp";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model) {
        model.addAttribute("username", "张飞");
        return "redirect:/index.jsp";
    }


}
