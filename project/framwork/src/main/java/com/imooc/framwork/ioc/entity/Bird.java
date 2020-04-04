package com.imooc.framwork.ioc.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bird implements Pet {
    @Override
    public void move() {
        System.out.println("Flying");
    }
}
