package com.designpattern.builder.item.impl.drink;

/**
 * 可乐
 */
public class Coke extends ClodDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
