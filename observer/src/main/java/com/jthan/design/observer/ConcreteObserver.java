package com.jthan.design.observer;

/**
 * Created by Administrator on 2016/2/1.
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Concrete Observer's state change to " + subject.getState());
    }
}
