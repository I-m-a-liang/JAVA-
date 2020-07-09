package com.dwhsama;

import com.dwhsama.dao.IUserDao;
import com.dwhsama.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis的入门案例
 */

public class MybatisTest {

    private InputStream in;
    private IUserDao userDao;
    private SqlSession session;

    @Before//在测试方法之前执行
    public void init() throws IOException {
        //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao借口的代理对象
         userDao = session.getMapper(IUserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destory() throws IOException {
        //6.释放资源
        session.close();
        in.close();
    }

    /**
     * 入门案例
     */
    @Test
    public void testAll(){

        //使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user :users){
            System.out.println(user);
        }

    }
}
