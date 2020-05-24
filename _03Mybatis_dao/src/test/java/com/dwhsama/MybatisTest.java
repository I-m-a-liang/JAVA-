package com.dwhsama;

import com.dwhsama.dao.IUserDao;
import com.dwhsama.dao.impl.UserDaoImpl;
import com.dwhsama.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * mybatis的入门案例
 */

public class MybatisTest {
    /**
     * 入门案例
     */
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象SqlSession session = factory.openSession();
        IUserDao userDao = new UserDaoImpl(factory);
        //4.使用SqlSession创建Dao借口的代理对象 /IUserDao userDao = session.getMapper(IUserDao.class);

        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for(User user :users){
            System.out.println(user);
        }
        //6.释放资源session.close();
        in.close();
    }
}
