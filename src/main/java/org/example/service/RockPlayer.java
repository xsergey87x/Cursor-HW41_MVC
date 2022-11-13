package org.example.service;

import org.example.model.MusicTrack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class RockPlayer {

    ArrayList<MusicTrack> rockTrackList = new ArrayList<>();

    public void addTrackToList(MusicTrack musicTrack) {
        rockTrackList.add(musicTrack);
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + rockTrackList.get(numberTrack);
    }

    public ArrayList<MusicTrack> getRockTrackList() {
        return rockTrackList;
    }

    public void setRockTrackList(ArrayList<MusicTrack> rockTrackList) {
        this.rockTrackList = rockTrackList;
    }

    @Override
    public String toString() {
        return "RockPlayer{" +
                "rockTrackList=" + rockTrackList +
                '}';
    }
}
