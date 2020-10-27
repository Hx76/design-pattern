package com.designpattern.chainOfResponsibility.impl;

import com.designpattern.chainOfResponsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger::"+message);
    }
}
