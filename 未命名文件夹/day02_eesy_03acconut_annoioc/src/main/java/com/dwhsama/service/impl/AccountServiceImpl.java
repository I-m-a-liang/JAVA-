package com.dwhsama.service.impl;

import com.dwhsama.dao.IAccountDao;
import com.dwhsama.domain.Account;
import com.dwhsama.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao= null;

    public List<Account> findAllAccount() {

        return accountDao.findAllAccount();
    }

    public Account findAccountByid(Integer accountId) {
        return accountDao.findAccountByid(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
