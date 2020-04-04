package com.imooc.framwork.ioc.config;
import com.imooc.framwork.ioc.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//打上这个标签以后会被注入容器
@Configuration
public class ApplicationConfig {
    // 将initPerson类返回的数据装配到IOC容器当中
//    @Bean(name="person")
//    public Person initPerson(){
//        Person user = new Person();
//        user.setId(1L);
//        user.setName("Jack");
//        return user;
//    }
}
