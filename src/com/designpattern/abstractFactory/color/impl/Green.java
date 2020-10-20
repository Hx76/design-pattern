package com.designpattern.abstractFactory.color.impl;

import com.designpattern.abstractFactory.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("绿色");
    }
}
