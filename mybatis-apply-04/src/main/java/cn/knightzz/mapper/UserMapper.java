package cn.knightzz.mapper;

import cn.knightzz.entity.Order;
import cn.knightzz.entity.User;

import java.util.List;

/**
 * @author 王天赐
 * @title: UserMapper
 * @projectName spring-aop-01
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/16 20:06
 */
public interface UserMapper {

    /**
     * 插入用户数据
     * @param user
     * @return 返回主键
     */
    public void saveUser(User user);

    /**
     * 通过 selectKey 的方式返回主键
     * @param user
     */
    public void saveUserBySelectKey(User user);

    /**
     * 根据id后者
     * @param user
     * @return
     */
    public User findUserByIdAndUsernameIf(User user);


    /**
     * 更新用户信息, 使用 set 标签
     * @param user
     */
    public void updateUserBySet(User user);

    /**
     * 根据id查询用户列表
     * @param ids
     * @return
     */
    public List<User> findAllUserById(List<Integer> ids);

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();


    /**
     * 查询所有用户信息以及其订单信息
     * @return
     */
    public List<User> findAllWithOrder();

    /**
     * 查找用户以及其权限列表
     * @return
     */
    public List<User> findAllWithRole();
}
