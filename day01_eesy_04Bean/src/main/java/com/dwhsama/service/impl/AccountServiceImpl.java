package com.dwhsama.service.impl;

import com.dwhsama.service.IAccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl  implements IAccountService {

    public AccountServiceImpl(){
        System.out.println("对象被创建了");
    }

    public void saveAccount() {

        System.out.println("service中的saveAccount方法执行了。。。。");
    }
}
