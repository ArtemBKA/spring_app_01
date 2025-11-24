package com.bka.music;

import java.util.List;

public class MusicPlayer {
    List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        double d = Math.round(Math.random());
        System.out.println(d);
        if (d == 0) {
            musicList.get(0).play();
        } else {
            musicList.get(1).play();
        }
    }
}
