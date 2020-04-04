package com.imooc.framwork.ioc.entity;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    @Override
    public void move(){
        System.out.println("running");
    }
}
