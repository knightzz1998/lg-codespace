package cn.knightzz.mapper;

import cn.knightzz.entity.Comment;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王天赐
 * @title: CommentMapper
 * @projectName springboot-apply-data
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 12:17
 */
public interface CommentMapper {

    /**
     * 根据id查询评论信息
     * @param id
     * @return
     */
    @Select("SELECT * FROM t_comment WHERE id = #{id}")
    public Comment findById(Integer id);
}
