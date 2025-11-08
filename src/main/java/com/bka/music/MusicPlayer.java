package com.bka.music;

public class MusicPlayer {

    Music music;
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        music.play();
    }
}
