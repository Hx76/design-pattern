package com.designpattern.builder.item.impl.burger;

import com.designpattern.builder.item.Item;
import com.designpattern.builder.pack.Packing;
import com.designpattern.builder.pack.impl.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
