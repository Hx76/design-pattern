package com.designpattern.factory.shap.impl;

import com.designpattern.factory.shap.Shap;

public class Square implements Shap {
    @Override
    public void draw() {
        System.out.println("画一个正方形");
    }
}
