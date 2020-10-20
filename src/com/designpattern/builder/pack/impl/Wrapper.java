package com.designpattern.builder.pack.impl;

import com.designpattern.builder.pack.Packing;

/**
 * 汉堡用纸装
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
