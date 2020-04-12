package com.gupaoedu.vip.pattern.factory.factoryMethod;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonCourseFactory extends ICourseFactory {

    @Override
    public ICourse create() {
        return  new PythonCourse();
    }
}
