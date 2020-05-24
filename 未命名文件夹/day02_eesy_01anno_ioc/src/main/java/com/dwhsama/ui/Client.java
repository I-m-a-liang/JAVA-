package com.dwhsama.ui;

import com.dwhsama.dao.IAccountDao;
import com.dwhsama.service.IAccountService;
import com.dwhsama.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */

public class Client {
    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //2.根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
//        IAccountDao aDao = (IAccountDao)ac.getBean("accountDao");
//        System.out.println(aDao);
//        System.out.println(as);
        as.saveAccount();
        ac.close();
    }
}

