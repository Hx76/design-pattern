package com.designpattern.abstractFactory.factory;

import com.designpattern.abstractFactory.color.Color;
import com.designpattern.abstractFactory.shap.Shap;
import com.designpattern.abstractFactory.shap.impl.Circle;
import com.designpattern.abstractFactory.shap.impl.Rectangle;
import com.designpattern.abstractFactory.shap.impl.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shap getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
