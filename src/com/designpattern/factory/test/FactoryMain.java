package com.designpattern.factory.test;

import com.designpattern.factory.shap.Shap;
import com.designpattern.factory.shap.ShapFactory;

public class FactoryMain {
    public static void main(String[] args) {
        ShapFactory factory = new ShapFactory();
        Shap shap1 = factory.getShap("CIRCLE");
        shap1.draw();
        Shap shap2 = factory.getShap("RECTANGLE");
        shap2.draw();
        Shap shap3 = factory.getShap("SQUARE");
        shap3.draw();
    }
}
