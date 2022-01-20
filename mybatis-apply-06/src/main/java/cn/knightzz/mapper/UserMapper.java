package cn.knightzz.mapper;

import cn.knightzz.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 王天赐
 * @title: UserMapper
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/20 17:15
 */
public interface UserMapper {

    /**
     * 查询用户列表
     * @return
     */
    @Select("select * from `user`")
    public List<User> findAll();

    /**
     * 插入数据
     * @param user
     */
    @Insert("insert into `user`(username,birthday,sex,address) VALUES(#{username},#{birthday},#{sex},#{address})")
    public void saveUser(User user);

    /**
     * 更新用户信息
     * @param user
     */
    @Update("UPDATE `user` SET username = #{username},birthday = #{birthday},sex = #{sex},address = #{address} WHERE id = #{id}")
    public void updateUser(User user);


    /**
     * 删除用户信息
     * @param id
     */
    @Delete("DELETE FROM `user` where id = #{id}")
    public void deleteUser(Integer id);
}
