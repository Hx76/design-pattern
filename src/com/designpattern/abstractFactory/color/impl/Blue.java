package com.designpattern.abstractFactory.color.impl;

import com.designpattern.abstractFactory.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("蓝色");
    }
}
