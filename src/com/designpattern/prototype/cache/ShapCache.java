package com.designpattern.prototype.cache;

import com.designpattern.prototype.shap.Shap;
import com.designpattern.prototype.shap.impl.Rectangle;
import com.designpattern.prototype.shap.impl.Cricle;
import com.designpattern.prototype.shap.impl.Square;

import java.util.Hashtable;

public class ShapCache {
    private static Hashtable<Integer, Shap> hashtable
            = new Hashtable<Integer, Shap>();
    public static Shap getShap(int id){
        Shap shapCache = hashtable.get(id);
        return (Shap) shapCache.clone();
    }

    public static void loadCache(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId(1);
        hashtable.put(rectangle.getId(), rectangle);

        Cricle circle = new Cricle();
        circle.setId(2);
        hashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId(3);
        hashtable.put(square.getId(),square);
    }
}
