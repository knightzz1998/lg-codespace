package cn.knightzz.mapper;

import cn.knightzz.entity.Comment;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: CommentMapperTest
 * @projectName springboot-apply-data
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 12:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class CommentMapperTest {

    @Resource
    CommentMapper commentMapper;

    @Test
    void findById() {
        Comment byId = commentMapper.findById(1);
        System.out.println(byId);
    }
}