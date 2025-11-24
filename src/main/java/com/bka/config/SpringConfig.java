package com.bka.config;

import com.bka.music.ClassicalMusic;
import com.bka.music.Music;
import com.bka.music.MusicPlayer;
import com.bka.music.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public List<Music> getMusicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(getClassicalMusic());
        musicList.add(getRockMusic());
        return musicList;
    }

    @Bean()
    public ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic getRockMusic() {
        return new RockMusic();
    }

    @Bean("musicPlayer")
    public MusicPlayer getMusicPlayer() {
        return new MusicPlayer(getMusicList());
    }
}
