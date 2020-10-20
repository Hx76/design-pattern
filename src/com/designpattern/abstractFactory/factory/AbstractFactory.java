package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.color.Color;
import com.designpattern.abstractFactory.shap.Shap;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shap getShape(String shape);
}
