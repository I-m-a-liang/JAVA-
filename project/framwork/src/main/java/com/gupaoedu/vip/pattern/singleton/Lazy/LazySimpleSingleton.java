package com.gupaoedu.vip.pattern.singleton.Lazy;

/**
 * Create by dwh on 20200413
 * 懒汉式
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton lazy = null;

    private  LazySimpleSingleton(){}

    public static LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy  = new LazySimpleSingleton(){};
        }
        return lazy;
    }
}
