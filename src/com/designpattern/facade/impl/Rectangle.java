package com.designpattern.facade.impl;

import com.designpattern.facade.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
