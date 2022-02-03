package cn.knightzz.service.impl;

import cn.knightzz.service.AccountService;
import org.springframework.stereotype.Service;

/**
 * @author 王天赐
 * @title: AccountServiceImpl
 * @projectName mybatis-apply-06
 * @description:
 * @website http://knightzz.cn/
 * @github https://github.com/knightzz1998
 * @date 2022/1/26 10:32
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void transfer() {
        System.out.println("开启转账业务 ... ");
    }
}
