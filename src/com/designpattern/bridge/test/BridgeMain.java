package com.designpattern.bridge.test;

import com.designpattern.bridge.Shape;
import com.designpattern.bridge.impl.Circle;
import com.designpattern.bridge.impl.GreenCircle;
import com.designpattern.bridge.impl.RedCircle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
