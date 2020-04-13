package com.gupaoedu.vip.pattern.singleton.Lazy;


/**
 * Create by dwh on 20200413
 * 懒汉式
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                    //cpu执行时候会转换成jvm指令执行
                    //指令重排序的问题，volatile
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.将初始化的对象和内存地址建立关联，赋值
                    //4.用户初次访问
                }
            }
        }
    return lazy;
    }

}
