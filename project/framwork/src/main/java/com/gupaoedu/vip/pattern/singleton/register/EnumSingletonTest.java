package com.gupaoedu.vip.pattern.singleton.register;

import com.gupaoedu.vip.pattern.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Create by dwh on 20200413
 * 注册式单例测试
 */
public class EnumSingletonTest {
//    public static void main(String[] args) {
//        EnumSingleton s1 = null;
//        EnumSingleton s2 = EnumSingleton.getInstance();
//
//        s2.setData(new Object());
//
//        FileOutputStream fos = null;
//        try{
//            fos = new FileOutputStream("EnumSingleton.obj");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(s2);
//            oos.flush();
//            oos.close();
//
//            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            s1 = (EnumSingleton)ois.readObject();
//            ois.close();
//
//            System.out.println(s1.getData());
//            System.out.println(s2.getData());
//            System.out.println(s1.getData() == s2.getData());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor(String.class,int.class);
            c.setAccessible(true);
            EnumSingleton obj=(EnumSingleton)c.newInstance("Tom",666);

            //从jdk层面就为美剧不被序列化和反射破坏来报价护航
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
