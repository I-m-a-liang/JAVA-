package com.gupaoedu.vip.pattern.factory.factoryMethod;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 工厂方法模式
 */
public abstract class ICourseFactory {
    public void  preCreate(){

    }
    abstract ICourse create();
}
