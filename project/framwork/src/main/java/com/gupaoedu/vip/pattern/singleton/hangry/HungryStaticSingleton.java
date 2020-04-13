package com.gupaoedu.vip.pattern.singleton.hangry;

/**
 * Create by dwh on 20200413
 * 饿汉式-静态块
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryGingleton;

    static {
        hungryGingleton  = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungryGingleton;
    }
}
