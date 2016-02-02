package com.jthan.design.strategy.behavior.group;

import com.jthan.design.strategy.behavior.Quack;

/**
 * Created by Administrator on 2016/2/2.
 */
public class NoQuack implements Quack{
    @Override
    public void quack() {
        System.out.println("CAN'T Quack");
    }
}
