package com.designpattern.builder.item.impl.drink;

/**
 * 茶
 */
public class Tea extends ClodDrink {
    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
