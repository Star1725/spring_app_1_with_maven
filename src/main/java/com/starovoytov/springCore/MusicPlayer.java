package com.starovoytov.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
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
//    public MusicPlayer() {
//    }
//    private String name;
//    private int volume;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getVolume() {
//        return volume;
//    }
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//
//    private Music music;
//    public void setMusic(Music music) {
//        this.music = music;
//    }
//    public void playMusic(){
//        System.out.println("Playing: " + music.getSong());
//    }
//
//    private List<Music> musicList = new ArrayList<>();
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//    public void playMusicList(){
//        for (Music song : musicList) {
//            System.out.println(" - " + song.getSong());
//        }
//    }

//лекция 10. Внедрение зависимостей. Annotation @Autowired
    //через поле(даже приватное)
//    @Autowired
//    private Music music;
    //через конструктор
    //@Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    //через сеттер
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public String playMusic(){
//        return "Playing: " + music.getSong();
//    }

//лекция 11. Внедрение зависимости. Annotation @Qualifier(""). Эта аннотация необходима если на одну зависимость претендуют несколько бинов
    //@Autowired//зависимость через поле
    //@Qualifier("rockMusic")//мы указываем конкретный класс, реализующий интерфейс Music
    private Music music;

    //зависимость через конструктор

    private Music music1;
    private Music music2;
    private Music music3;
    //Если конструктор принимает несколько аргументов, реализующих один интерфейс, мы в @Qualifier("classicalMusic") указываем конкретный класс, реализующий интерфейс Music
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic")Music music1, @Qualifier("chansonMusic")Music music2, @Qualifier("rockMusic")Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(){
        return "Playing: " + music.getSong();
    }
    public String playRandomMusic(MusicGenres musicGenres){
        String song = null;
        switch (musicGenres){
            case ROCK:
                song = music3.getSong();
                break;
            case CHANSON:
                song = music2.getSong();
                break;
            case CLASSIC:
                song = music1.getSong();
                break;
        }
        return song;
    }
}
