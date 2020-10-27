package com.designpattern.facade.test;

import com.designpattern.facade.ShapeMaker;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
