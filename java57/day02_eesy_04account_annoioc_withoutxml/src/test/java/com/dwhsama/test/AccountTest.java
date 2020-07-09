package com.dwhsama.test;

import com.dwhsama.domain.Account;
import com.dwhsama.service.IAccountService;
import config.SpringConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit单元测试：测试我们的配置
 * Spring整合junit的配置
 *      1。导入spring整合junit的jar（坐标）
 *      2。使用Junit提供的一个注解把原有的main方法替换了，替换成spring提供的
 *           @Runsith
 *      3.告知spring的运行器，spring的Ioc创建是基于xml还是注解的，并且说明位置
 *           @ContextConfigurarion
 *              localtions:指定xml文件的位置，加上calsspsth关键字，表示在类路径下
 *              classes：指定注解类所在的位置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountTest {
    @Autowired
    private IAccountService as;

    @Test
    public void testFingAll() {
        // 1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        // 2.得到业务层对象
//        IAccountService as = ac.getBean("accountService",IAccountService.class);
        // 3.执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFingOne() {
        // 3.执行方法
        Account account = as.findAccountByid(5);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        // 1.获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        // 3.执行方法
        as.saveAccount(account);
    }

    @Test
    public void testUpdate() {
        // 1.获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        // 3.执行方法
        Account account = as.findAccountByid(4);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    @Test
    public void testDelete() {
        // 1.获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        // 3.执行方法
        as.deleteAccount(4);
    }
}
