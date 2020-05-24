package com.dwhsama.service.impl;

import com.dwhsama.dao.IAccountDao;
import com.dwhsama.dao.impl.AccountDaoImpl;
import com.dwhsama.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 账户的业务层实现类
 * 曾经的xml的配置
 *
 *  <bean id="accountService" class="com.dwhsama.service.impl.AccountServiceImpl"
 *             scope = "" init-method ="" destroy = "">
 *             <property name ="" value = ""></property>
 *             </bean>
 *
 * 用于创建对象的注解
 *      他们的作用就喝在XML文件只能够编写一个<bean></>标签实现的功能是一样的
 *          Component：
 *              作用：用于把当前类对象存入Spring容器中
 *              属性：
 *                  value：用于指定bean的id，当我们不写时，她的默认值是当前类名,且首字母变小写
 *          Controller:一般用于表现层
 *          Service:一般用于业务层
 *          Repository:一般用于持久层
 *          以上三个注解的作用和属性于Component是一模一样的。
 *          他们三个是spring为我们提供明确的三层使用的注解，使我们的三层对象更加清晰
 * 用于注入数据
 *      他们的作用就和在XML配置文件中的bean标签中写一个<property></>是一样的
 *      Autowired
 *          作用：自动按照类型注入。只要容器中有唯一的一个bean对象和要注入的变量类型匹配，就可以注入成功
 *                  如果ioc容器中没有任何bean的类型和要注入的类型匹配，则注入失败
 *                  如果ioc容器中有多个类型匹配时，
 *          出现位置：类上或者方法上
 *      Qualifier：
 *          作用：在按照类中注入的基础智商在按照名称注入。他在给类成员注入是不能单独使用。但是在给方法参数注入时可以
 *          属性：
 *              value ： 用于指定注入bean的id
 *      Recource ：
 *          作用：直接按照bean的id注入，可以独立使用
 *          属性：
 *              name： 用于指定bean的id
 *      以上三个注入都只能植入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现
 *      另外，集合类型的注入只能通过XML来实现
 *
 *
 *      Value：
 *          作用：用于注入基本类型和String类型的数据
 *          属性：
 *              value：用于指定数据的值，它可以使用spring中SpEL（也就是Spring的el表达式）
 *                  SpEL的写法：${表达式}
 *
 * 用于改变作用范围的
 *      他们的作用就和在bean标签中使用scope属性实现的功能是一样的
 *      Scope：
 *          作用：用于指定bean的作用范围
 *          属性：
 *              value：指定范围的取值 singleton prototype
 *
 * 和生命周期相关的  了解
 *       他们的作用就喝在bean标签中使用init-method和destroy-method的作用是一样的
 *       PreDestroy
 *          作用：用于指定销毁方法
 *       PostConsturt
 *          作用：用于指定初始化方法
 */
@Service("accountService")
@Scope("singleton")
public class AccountServiceImpl  implements IAccountService {

//    @Autowired
//    @Qualifier("accountDao1")
    @Resource(name = "accountDao1")
    private IAccountDao accountDao = null;

    @PostConstruct
    public void init() {

        System.out.println("初始化方法执行了");
    }

    @PreDestroy
    public void destroy() {

        System.out.println("销毁方法执行了");
    }

    public void saveAccount() {

        accountDao.saveAccount();
    }
}
