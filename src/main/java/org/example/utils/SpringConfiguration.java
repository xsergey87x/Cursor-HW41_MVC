package org.example.utils;

import org.example.model.MusicTrack;
import org.example.service.ClassicPlayer;
import org.example.service.MusicPlayerService;
import org.example.service.MusicPlayerServiceServiceImpl;
import org.example.service.RockPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public MusicTrack firstClassicTrack() {
        MusicTrack firstClassicTrack = new MusicTrack("Ноктюрн 2", "Шопен");
        return firstClassicTrack;
    }

    @Bean
    public MusicTrack secondClassicTrack() {
        MusicTrack secondClassicTrack = new MusicTrack("Симфония номер 5", "Бетховен");
        return secondClassicTrack;
    }

    @Bean
    public MusicTrack firstRockTrack() {
        MusicTrack firstRockTrack = new MusicTrack("Nothing else matters", "Metallica");
        return firstRockTrack;
    }

    @Bean
    public MusicTrack secondRockTrack() {
        MusicTrack secondRockTrack = new MusicTrack("Wind of change", "Scorpions");
        return secondRockTrack;
    }

    @Bean
    public RockPlayer rockPlayerService() {
        RockPlayer rockPlayer = new RockPlayer();
        rockPlayer.addTrackToList(firstRockTrack());
        rockPlayer.addTrackToList(secondRockTrack());
        return rockPlayer;
    }

    @Bean
    public ClassicPlayer classicPlayerService() {
        ClassicPlayer classicPlayer = new ClassicPlayer();
        classicPlayer.addTrackToList(firstClassicTrack());
        classicPlayer.addTrackToList(secondClassicTrack());
        return classicPlayer;
    }

    @Bean
    public MusicPlayerService musicPlayer() {
        MusicPlayerServiceServiceImpl musicPlayerService = new MusicPlayerServiceServiceImpl(classicPlayerService(), rockPlayerService());
        return musicPlayerService;
    }

}
