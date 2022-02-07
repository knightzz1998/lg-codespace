package cn.knightzz.mapper;

import cn.knightzz.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 王天赐
 * @title: AtricleMapper
 * @projectName springboot-apply-data
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 12:49
 */
public interface ArticleMapper {

    /**
     * 查询所有文章
     * @return
     */
    public List<Article> selectArticle();
}
