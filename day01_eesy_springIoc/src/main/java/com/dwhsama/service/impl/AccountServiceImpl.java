package com.dwhsama.service.impl;

import com.dwhsama.dao.IAccountDao;
import com.dwhsama.dao.impl.AccountDaoImpl;
import com.dwhsama.service.IAccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl  implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {

        accountDao.saveAccount();
    }
}
