package com.designpattern.factory.shap.impl;

import com.designpattern.factory.shap.Shap;

public class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
