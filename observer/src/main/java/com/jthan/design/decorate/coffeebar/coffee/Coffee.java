package com.jthan.design.decorate.coffeebar.coffee;

import com.jthan.design.decorate.coffeebar.Drink;

/**
 * decorated
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return this.getPrice();
    }
}
