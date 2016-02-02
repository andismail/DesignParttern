package com.jthan.design.strategy.behavior.duck;

import com.jthan.design.strategy.behavior.Fly;
import com.jthan.design.strategy.behavior.Quack;

/**
 * Created by Administrator on 2016/2/2.
 */
public abstract class ParentDuck {
     Fly fly;
     Quack quack;

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public void setQuack(Quack quack) {
        this.quack = quack;
    }

    public void fly() {
        this.fly.fly();
    }

    public void quack() {
        this.quack.quack();
    }

    public abstract void display();
}
