package com.gupaoedu.vip.pattern.factory.abastractFactory;

public class AbastractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();

        ICourseFactory factory1 = new PythonFactory();
        factory.createVideo();
        factory.createNote();
        factory.createCourse();

    }
}
