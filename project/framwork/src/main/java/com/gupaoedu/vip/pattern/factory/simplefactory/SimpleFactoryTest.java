package com.gupaoedu.vip.pattern.factory.simplefactory;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

/**
 *  Create by gupao 2019412
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {

        CourseFactory factory = new CourseFactory();
        // ICourse course = new JavaCourse();
        ICourse course = factory.create(PythonCourse.class);
        course.record();

    }
}
