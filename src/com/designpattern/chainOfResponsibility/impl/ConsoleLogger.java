package com.designpattern.chainOfResponsibility.impl;

import com.designpattern.chainOfResponsibility.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger::"+message);
    }
}
