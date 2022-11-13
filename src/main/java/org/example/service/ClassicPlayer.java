package org.example.service;

import org.example.model.MusicTrack;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class ClassicPlayer {

    ArrayList<MusicTrack> classicTrackList = new ArrayList<>();

    public void addTrackToList(MusicTrack musicTrack) {
        classicTrackList.add(musicTrack);
    }

    public String playTrack(int numberTrack) {
        return "Now track number" + numberTrack + "is playing" + "Track information:  " + classicTrackList.get(numberTrack);
    }

    public ArrayList<MusicTrack> getClassicTrackList() {
        return classicTrackList;
    }

    public void setClassicTrackList(ArrayList<MusicTrack> classicTrackList) {this.classicTrackList = classicTrackList;}

    @Override
    public String toString() {
        return "ClassicPlayer{" +
                "classicTrackList=" + classicTrackList +
                '}';
    }
}
