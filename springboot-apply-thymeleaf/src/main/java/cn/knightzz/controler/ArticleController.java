package cn.knightzz.controler;

import cn.knightzz.entity.Article;
import cn.knightzz.mapper.ArticleMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王天赐
 * @title: ArticleController
 * @projectName springboot-apply-thymeleaf
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 16:39
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Resource
    ArticleMapper articleMapper;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Article> articleList = articleMapper.findAll();
        model.addAttribute("articleList", articleList);
        return "article";
    }
}
