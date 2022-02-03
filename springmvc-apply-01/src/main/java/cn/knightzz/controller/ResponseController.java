package cn.knightzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 王天赐
 * @title: ResponseController
 * @projectName springmvc-apply-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/2 14:02
 */
@Controller
public class ResponseController {

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 1.通过response直接响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("returnVoid");
        // ----------------------------------------
        request.setAttribute("username", "root");
        // 2.通过request实现转发
        request.getRequestDispatcher("/pages/success.jsp").forward(request, response);
        // ----------------------------------------
        // 3.通过response实现重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    @RequestMapping("/returnModelAndView1")
    public ModelAndView returnModelAndView1() {
        // Model:模型 作用封装数据 View：视图 作用展示数据
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "方式一");
        //设置视图名称, 跳转到 result 页面
        modelAndView.setViewName("result"); return modelAndView;
    }

    @RequestMapping("/returnModelAndView2")
    public ModelAndView returnModelAndView1(ModelAndView modelAndView) {
        //设置模型数据
        modelAndView.addObject("username", "方式二");
        //设置视图名称, 跳转到 result 页面
        modelAndView.setViewName("result"); return modelAndView;
    }
}
