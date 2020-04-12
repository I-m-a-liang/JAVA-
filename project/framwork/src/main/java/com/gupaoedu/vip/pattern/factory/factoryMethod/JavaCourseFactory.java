package com.gupaoedu.vip.pattern.factory.factoryMethod;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.JavaCourse;

public class JavaCourseFactory extends ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
