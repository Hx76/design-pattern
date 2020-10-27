package com.designpattern.facade.impl;

import com.designpattern.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square");
    }
}
