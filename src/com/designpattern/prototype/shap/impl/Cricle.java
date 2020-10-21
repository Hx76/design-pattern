package com.designpattern.prototype.shap.impl;

import com.designpattern.prototype.shap.Shap;

public class Cricle extends Shap {
    public Cricle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
