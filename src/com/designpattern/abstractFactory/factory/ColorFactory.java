package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.color.Color;
import com.designpattern.abstractFactory.color.impl.Blue;
import com.designpattern.abstractFactory.color.impl.Green;
import com.designpattern.abstractFactory.color.impl.Red;
import com.designpattern.abstractFactory.shap.Shap;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shap getShape(String shape) {
        return null;
    }
}
