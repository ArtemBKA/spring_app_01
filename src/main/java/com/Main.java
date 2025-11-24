package com;

import com.bka.music.MusicPlayer;
import com.bka.config.SpringConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();

        context.close();
    }



}
