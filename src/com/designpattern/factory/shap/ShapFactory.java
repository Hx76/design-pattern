package com.designpattern.factory.shap;

import com.designpattern.factory.shap.Shap;
import com.designpattern.factory.shap.impl.Circle;
import com.designpattern.factory.shap.impl.Rectangle;
import com.designpattern.factory.shap.impl.Square;

public class ShapFactory {
    public Shap getShap(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
