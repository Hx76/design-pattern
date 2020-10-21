package com.designpattern.prototype.test;

import com.designpattern.prototype.cache.ShapCache;
import com.designpattern.prototype.shap.Shap;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapCache.loadCache();

        Shap shap1 = ShapCache.getShap(1);
        System.out.println(shap1.getType());

        Shap shap2 = ShapCache.getShap(2);
        System.out.println(shap2.getType());

        Shap shap3 = ShapCache.getShap(3);
        System.out.println(shap3.getType());
    }
}
