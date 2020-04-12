package com.gupaoedu.vip.pattern.factory.abastractFactory;

import com.gupaoedu.vip.pattern.factory.ICourse;

/**
 * 抽象工厂模式
 * 要求所有的子工程都实现这个工厂
 * （一个品牌的抽象）
 * 抽象工厂不符合开闭原则
 * 但是扩展性非常强
 */
public interface ICourseFactory {

    ICourse createCourse();
    INote createNote();
    IVideo createVideo();
    // ISource createSourcce();

}
