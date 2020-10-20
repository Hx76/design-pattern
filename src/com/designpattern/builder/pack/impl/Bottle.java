package com.designpattern.builder.pack.impl;

import com.designpattern.builder.pack.Packing;

/**
 * 饮料用瓶子装
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
