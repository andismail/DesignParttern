package com.jthan.design.observer;

/**
 * Created by Administrator on 2016/2/1.
 */
public class ConcreteSubject extends Subject{

    public void change(String state) {
        this.setState(state);
        System.out.println("concrete subject state has changed ^^");
        this.notification();
    }

}
