package com.designpattern.builder.item.impl.drink;

import com.designpattern.builder.item.Item;
import com.designpattern.builder.pack.Packing;
import com.designpattern.builder.pack.impl.Bottle;

public abstract class ClodDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
