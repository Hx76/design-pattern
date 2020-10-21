package com.designpattern.adapter.media.adapter;

import com.designpattern.adapter.advancedmedia.AdvancedMediaPlayer;
import com.designpattern.adapter.advancedmedia.impl.Mp4Player;
import com.designpattern.adapter.advancedmedia.impl.VlcPlayer;
import com.designpattern.adapter.media.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
