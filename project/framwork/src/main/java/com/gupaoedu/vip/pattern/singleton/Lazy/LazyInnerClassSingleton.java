package com.gupaoedu.vip.pattern.singleton.Lazy;

/**
 * Create by dwh on 20200413
 * 懒汉式
 */
//全程没有使用synchronized
//性能最优的一种方法
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.lazy!=null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }


    //懒汉式单例
    //LazyHolder里面的逻辑需要外部方法调用时才执行
    //巧妙利用了内部类的特性
    //JVM底层执行原理，完美的避免了线程安全问题
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    //内部类
    private static  class  LazyHolder{
        private static final LazyInnerClassSingleton lazy
                = new LazyInnerClassSingleton();
    }
}
