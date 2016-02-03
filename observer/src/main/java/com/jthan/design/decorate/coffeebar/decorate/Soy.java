package com.jthan.design.decorate.coffeebar.decorate;

import com.jthan.design.decorate.coffeebar.Drink;

/**
 * Created by Administrator on 2016/2/3.
 */
public class Soy extends Decorate{
    public Soy(Drink drink) {
        super(drink);
        this.setDescription("Soy~");
        this.setPrice(40);
    }
}
