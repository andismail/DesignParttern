package com.jthan.design.strategy.behavior.group;

import com.jthan.design.strategy.behavior.Fly;

/**
 * Created by Administrator on 2016/2/2.
 */
public class BadFly implements Fly {
    @Override
    public void fly() {
        System.out.println("BAD Fly!");
    }
}
