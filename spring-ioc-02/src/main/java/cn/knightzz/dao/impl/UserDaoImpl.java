package cn.knightzz.dao.impl;

import cn.knightzz.dao.UserDao;

import java.util.*;

/**
 * @author 王天赐
 * @title: UserDaoImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 19:20
 */
public class UserDaoImpl implements UserDao {

    /**
     * 集合注入
     */
    private List<Object> list;

    private Set<Object> set;

    private Object[] array;

    private Map<String, Object> map;

    /**
     * 配置文件注入
     */
    private Properties properties;

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "list=" + list +
                ", set=" + set +
                ", array=" + Arrays.toString(array) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public void saveUser() {
        System.out.println("User Save ... ");
    }

    @Override
    public void init() {
        System.out.println("UserDaoImpl init ... ");
    }

    @Override
    public void destroy() {
        System.out.println("UserDaoImpl destroy ... ");
    }

}
