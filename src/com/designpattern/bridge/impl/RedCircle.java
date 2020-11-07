package com.designpattern.bridge.impl;

import com.designpattern.bridge.DrawAPI;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画一个红色圆圈");
    }
}
