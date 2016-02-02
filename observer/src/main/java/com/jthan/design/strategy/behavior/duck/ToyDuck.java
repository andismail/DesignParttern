package com.jthan.design.strategy.behavior.duck;

import com.jthan.design.strategy.behavior.group.GoodFly;
import com.jthan.design.strategy.behavior.group.GoodQuack;
import com.jthan.design.strategy.behavior.group.NoFly;
import com.jthan.design.strategy.behavior.group.NoQuack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class ToyDuck extends ParentDuck{

    public ToyDuck() {
        fly = new NoFly();
        quack = new NoQuack();
    }

    @Override
    public void display() {
        this.quack();
        this.fly();
    }
}
