package com.dwhsama.test;

import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 使用junit单元测试：测试我们的配置
 */
public class QueryTunnerTest {
    @Test
    public void testQueryRunner() {
        // 1.获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        // 2.得到业务层对象
        QueryRunner runner = ac.getBean("runner",QueryRunner.class);
        QueryRunner runner2 = ac.getBean("runner",QueryRunner.class);
        // 3.执行方法
        System.out.println(runner == runner2);
    }
}
