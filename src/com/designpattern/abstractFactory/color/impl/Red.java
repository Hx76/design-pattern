package com.designpattern.abstractFactory.color.impl;

import com.designpattern.abstractFactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色");
    }
}
