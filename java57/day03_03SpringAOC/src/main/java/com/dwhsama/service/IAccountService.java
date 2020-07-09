package com.dwhsama.service;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 模拟账户的保存
     */
     void saveAccount();

    /**
     * 模拟账户更新
     * @param i
     */
     void updateAccunt(int i);

    /**
     * 模拟账户删除
     * @return
     */
     int deleteAccount();
}
