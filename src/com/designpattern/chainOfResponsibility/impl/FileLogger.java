package com.designpattern.chainOfResponsibility.impl;

import com.designpattern.chainOfResponsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger::"+message);
    }
}
