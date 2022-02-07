package cn.knightzz.mapper;

import cn.knightzz.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: ArticleMapperTest
 * @projectName springboot-apply-thymeleaf
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 16:26
 */
@SpringBootTest
class ArticleMapperTest {

    @Resource
    ArticleMapper articleMapper;

    @Test
    void findAll() {
        List<Article> articleList = articleMapper.findAll();
        for (Article article : articleList) {
            System.out.println(article);
        }
    }

    @Test
    void saveArticle() {

        Article article = new Article();
        article.setTitle("Spring ...");
        article.setContent("啊哈哈哈哈哈");

        articleMapper.saveArticle(article);
    }

    @Test
    void editArticle() {
    }

    @Test
    void delArticle() {
    }
}