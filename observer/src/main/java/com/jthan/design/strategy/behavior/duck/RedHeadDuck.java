package com.jthan.design.strategy.behavior.duck;

import com.jthan.design.strategy.behavior.Fly;
import com.jthan.design.strategy.behavior.Quack;
import com.jthan.design.strategy.behavior.group.GoodFly;
import com.jthan.design.strategy.behavior.group.GoodQuack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class RedHeadDuck extends ParentDuck{

    public RedHeadDuck() {
        fly = new GoodFly();
        quack = new GoodQuack();
    }

    @Override
    public void display() {
        this.quack();
        this.fly();
    }
}
