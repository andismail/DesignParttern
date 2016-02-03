package com.jthan.design.decorate.coffeebar;

/**
 * Created by Administrator on 2016/2/3.
 */
public abstract class Drink {
    private String description;
    private float price;

    public String getDescription() {
        return description + price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
