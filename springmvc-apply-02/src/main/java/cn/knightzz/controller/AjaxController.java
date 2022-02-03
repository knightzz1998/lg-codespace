package cn.knightzz.controller;

import cn.knightzz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 王天赐
 * @title: AjaxController
 * @projectName springmvc-apply-02
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 16:55
 */
@Controller
public class AjaxController {

    @RequestMapping(value = "/ajaxRequest")
    @ResponseBody
    public List<User> ajaxRequest(@RequestBody List<User> list) {
        System.out.println(list);
        return list;
    }
}
