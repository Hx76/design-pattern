package com.designpattern.prototype.shap.impl;

import com.designpattern.prototype.shap.Shap;

public class Square extends Shap {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
