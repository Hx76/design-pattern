package com.designpattern.abstractFactory.shap.impl;

import com.designpattern.abstractFactory.shap.Shap;

public class Square implements Shap {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
