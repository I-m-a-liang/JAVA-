package com.gupaoedu.vip.pattern.singleton.hangry;

/**
 * Create by dwh on 20200413
 * 饿汉式
 */
public class HungrySingleton {

    private static final HungrySingleton hungryGingleton
            = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungryGingleton;
    }
}
