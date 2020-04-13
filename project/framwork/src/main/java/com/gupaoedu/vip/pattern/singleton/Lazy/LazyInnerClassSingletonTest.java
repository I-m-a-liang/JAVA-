package com.gupaoedu.vip.pattern.singleton.Lazy;

import java.lang.reflect.Constructor;

/**
 * Create by dwh on 20200413
 * 懒汉式
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException {

        try {
            //调用时不走寻常路，破坏了单例
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(null);

            c.setAccessible(true);

            Object o1 = c.newInstance();

            //正常实例
            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);
        }catch (Exception e){
            e.printStackTrace();
        }
}
}