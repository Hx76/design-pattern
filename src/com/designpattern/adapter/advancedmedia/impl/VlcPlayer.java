package com.designpattern.adapter.advancedmedia.impl;

import com.designpattern.adapter.advancedmedia.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("在播放vlc格式文件，文件名："+fileName);
    }
}
