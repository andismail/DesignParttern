package com.jthan.design.decorate.coffeebar.decorate;

import com.jthan.design.decorate.coffeebar.Drink;

/**
 * Created by Administrator on 2016/2/3.
 */
public class Decorate extends Drink{
    private Drink drink;

    public Decorate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return this.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + drink.getDescription();
    }
}
