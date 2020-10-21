package com.designpattern.prototype.shap.impl;

import com.designpattern.prototype.shap.Shap;

public class Rectangle extends Shap {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
