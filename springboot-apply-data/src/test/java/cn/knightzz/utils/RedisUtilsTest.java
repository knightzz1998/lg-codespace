package cn.knightzz.utils;

import cn.knightzz.entity.Comment;
import cn.knightzz.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 王天赐
 * @title: RedisUtilsTest
 * @projectName springboot-apply-data
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/2/7 13:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class RedisUtilsTest {

    @Resource
    RedisUtils redisUtils;

    @Resource
    CommentMapper commentMapper;

    @Test
    void get() {
        Comment comment = (Comment) redisUtils.get("comment.findById");
        System.out.println(comment);
    }

    @Test
    void set() {
        redisUtils.set("comment.findById", commentMapper.findById(1));
    }

    @Test
    void getAndSet() {
    }

    @Test
    void delete() {
    }
}