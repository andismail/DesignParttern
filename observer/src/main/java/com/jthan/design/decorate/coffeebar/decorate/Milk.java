package com.jthan.design.decorate.coffeebar.decorate;

import com.jthan.design.decorate.coffeebar.Drink;

/**
 * Created by Administrator on 2016/2/3.
 */
public class Milk extends Decorate{
    public Milk(Drink drink) {
        super(drink);
        this.setDescription("Milk");
        this.setPrice(30);

    }
}
