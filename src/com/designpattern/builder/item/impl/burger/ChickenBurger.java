package com.designpattern.builder.item.impl.burger;

/**
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
