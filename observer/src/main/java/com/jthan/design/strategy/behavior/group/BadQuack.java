package com.jthan.design.strategy.behavior.group;

import com.jthan.design.strategy.behavior.Quack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class BadQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("BAD Quack!");
    }
}
