package com.jthan.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/1.
 */
public abstract class Subject {
    List<Observer> observers;

    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Subject(){
        this.observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notification() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }


}
