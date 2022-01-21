package cn.knightzz.mapper;

import cn.knightzz.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * @author 王天赐
 * @title: OrderMapper
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/21 16:41
 */
public interface OrderMapper {

    /**
     * 根据 uid 查询 订单信息
     * @param uid
     * @return
     */
    @Select("select * from `orders` where uid = #{uid}")
    public User findByUid(Integer uid);
}
