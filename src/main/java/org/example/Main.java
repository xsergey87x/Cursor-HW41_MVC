package org.example;

import org.example.service.MusicPlayerService;
import org.example.utils.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        MusicPlayerService musicPlayerService = (MusicPlayerService) applicationContext.getBean("musicPlayer");

        System.out.println(musicPlayerService.playClassicMusic(0));
        System.out.println(musicPlayerService.playRockMusic(1));
    }
}