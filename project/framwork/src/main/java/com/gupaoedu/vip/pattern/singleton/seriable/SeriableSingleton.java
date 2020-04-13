package com.gupaoedu.vip.pattern.singleton.seriable;

import java.io.Serializable;

public class SeriableSingleton implements Serializable {


    public final static SeriableSingleton INSRABCE =
            new SeriableSingleton();
    private SeriableSingleton(){

    }

    public static SeriableSingleton getInstance(){return INSRABCE;}

    private Object readResolve(){
        return INSRABCE;
    }
}
