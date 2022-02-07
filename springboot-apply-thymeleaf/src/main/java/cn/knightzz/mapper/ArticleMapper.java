package cn.knightzz.mapper;

import cn.knightzz.entity.Article;

import java.util.List;

/**
 * @author 王天赐
 * @title: ArticalMapper
 * @projectName springboot-apply-thymeleaf
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 16:08
 */
public interface ArticleMapper {

    /**
     * 查询所有文章列表
     * @return
     */
    public List<Article> findAll();

    /**
     * 添加文章
     * @param article
     */
    public void saveArticle(Article article);

    /**
     * 修改文章信息
     * @param article
     */
    public void editArticle(Article article);

    /**
     * 删除文章信息
     * @param id
     */
    public void delArticle(Integer id);
}
