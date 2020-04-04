package com.imooc.framwork;

import com.imooc.framwork.ioc.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FramworkApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(FramworkApplication.class, args);
        Person person = ctx.getBean(Person.class);
        System.out.println("Name is "+ person.getName());
        person.call();
    }

}
