package com.imooc.framwork.ioc.entity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
    @Value("1")
    private Long id;
    @Value("Jack")
    private String name;
    //会根据属性的类型找到对应的Bean 注入最基本的一条就是根据类型
    @Autowired
    private Pet pet;

    public void call(){
        pet.move();
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
