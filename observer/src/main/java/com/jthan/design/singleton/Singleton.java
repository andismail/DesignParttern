package com.jthan.design.singleton;

/**
 *
 */
public class Singleton {
    //the volatile here,I thought,is unnecessary
    private static volatile Singleton uniqueInstance = null;

    //private constructor
    private Singleton() {
    }

    //thread safe get unique instance
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            //if concurrent,this will run only once
            synchronized (Singleton.class){
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
