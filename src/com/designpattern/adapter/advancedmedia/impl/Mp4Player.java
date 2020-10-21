package com.designpattern.adapter.advancedmedia.impl;

import com.designpattern.adapter.advancedmedia.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("在播放mp4格式文件，文件名："+fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
