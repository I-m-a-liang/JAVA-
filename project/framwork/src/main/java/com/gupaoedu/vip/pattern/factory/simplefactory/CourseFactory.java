package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 简单工厂模式
 */
public class CourseFactory {
//    public  ICourse create(String name){
//        if("Java".equals(name))
//        {
//            return  new JavaCourse();
//        }
//        else {
//            return null;
//        }
//    }
    public ICourse create(Class clazz)
    {
        try {
            if (null != clazz ) {
                return (ICourse) clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public  ICourse create(String className)
    {
        try {
            if (!(null == className || "".equals(className))) {
                return (ICourse) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
