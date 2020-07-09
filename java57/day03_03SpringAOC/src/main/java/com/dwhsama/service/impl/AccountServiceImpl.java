package com.dwhsama.service.impl;

import com.dwhsama.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }

    @Override
    public void updateAccunt(int i) {
        System.out.println("更新了账户");
    }
    @Override
    public int deleteAccount() {
        System.out.println("删除了账户");
        return 0;
    }
}
