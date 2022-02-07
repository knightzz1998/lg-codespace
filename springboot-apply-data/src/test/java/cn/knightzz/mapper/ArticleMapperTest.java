package cn.knightzz.mapper;

import cn.knightzz.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: ArticleMapperTest
 * @projectName springboot-apply-data
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 13:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class ArticleMapperTest {

    @Resource
    ArticleMapper articleMapper;

    @Test
    void selectArticle() {

        List<Article> articles = articleMapper.selectArticle();
        System.out.println(articles);
    }
}