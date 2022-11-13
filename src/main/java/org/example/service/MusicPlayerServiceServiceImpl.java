package org.example.service;

public class MusicPlayerServiceServiceImpl implements MusicPlayerService {

    public MusicPlayerServiceServiceImpl(ClassicPlayer classicalPlayerService, RockPlayer rockPlayerService) {
        this.classicalPlayerService = classicalPlayerService;
        this.rockPlayerService = rockPlayerService;
    }

    private final ClassicPlayer classicalPlayerService;
    private final RockPlayer rockPlayerService;


    @Override
    public String playClassicMusic(int trackNumber) {
        return classicalPlayerService.playTrack(trackNumber);
    }

    @Override
    public String playRockMusic(int trackNumber) {
        return rockPlayerService.playTrack(trackNumber);
    }


}
