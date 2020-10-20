package com.designpattern.abstractFactory.shap.impl;

import com.designpattern.abstractFactory.shap.Shap;

public class Circle implements Shap {
    @Override
    public void draw() {
        System.out.println("画一个圆圈");
    }
}
