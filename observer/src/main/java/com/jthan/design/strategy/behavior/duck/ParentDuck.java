package com.jthan.design.strategy.behavior.duck;

import com.jthan.design.strategy.behavior.Fly;
import com.jthan.design.strategy.behavior.Quack;

/**
 * Created by Administrator on 2016/2/2.
 */
public abstract class ParentDuck {
    //引用行为接口，同时对于一个类来说，意思是鸭子有这两个行为
    Fly fly;
    Quack quack;

    //具体行为由其子类实现
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
