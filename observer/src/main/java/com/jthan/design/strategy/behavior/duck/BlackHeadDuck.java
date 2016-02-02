package com.jthan.design.strategy.behavior.duck;

import com.jthan.design.strategy.behavior.group.BadFly;
import com.jthan.design.strategy.behavior.group.BadQuack;
import com.jthan.design.strategy.behavior.group.NoFly;
import com.jthan.design.strategy.behavior.group.NoQuack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class BlackHeadDuck extends ParentDuck{

    public BlackHeadDuck() {
        fly = new BadFly();
        quack = new BadQuack();
    }

    @Override
    public void display() {
        this.quack();
        this.fly();
    }
}
