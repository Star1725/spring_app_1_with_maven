package com.starovoytov.springCore;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {



//лекция 5. IoC
//    private Music music;
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }

//лекция 6. Создаём файл свойств musicPlayer.properties
    public MusicPlayer() {
    }

    private String name;
    private int volume;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }


    private Music music;
    public void setMusic(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }

    private List<Music> musicList = new ArrayList<>();
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
    public void playMusicList(){
        for (Music song : musicList) {
            System.out.println(" - " + song.getSong());
        }
    }









}
