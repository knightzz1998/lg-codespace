package cn.knightzz.service.impl;

import cn.knightzz.dao.UserDao;
import cn.knightzz.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author 王天赐
 * @title: UserServiceImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/23 14:10
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * JDK11以后完全移除了javax扩展导致不能使用@resource注解
     * 相当于@Autowired+@Qualifier，按照名称进行注入
     */
    @Resource
    private UserDao userDao;

    @Value("${jdbc.username}")
    private String username;


    // 测试 Bean 声明周期

    @PostConstruct
    public void init(){ System.out.println("初始化方法...."); }

    @PreDestroy
    public void destroy(){ System.out.println("销毁方法....."); }


    @Override
    public void saveUser() {
        userDao.saveUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
