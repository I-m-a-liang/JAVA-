package com.gupaoedu.vip.pattern.factory.abastractFactory;

import com.gupaoedu.vip.pattern.factory.ICourse;
import com.gupaoedu.vip.pattern.factory.PythonCourse;

public class PythonFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
