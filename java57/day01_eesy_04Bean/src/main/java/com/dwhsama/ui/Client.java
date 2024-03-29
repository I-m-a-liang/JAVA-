package com.dwhsama.ui;

import com.dwhsama.service.IAccountService;
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
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        IAccountService as = (IAccountService)ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();
    }
}

