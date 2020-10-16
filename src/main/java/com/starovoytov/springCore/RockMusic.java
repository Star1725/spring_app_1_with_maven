package com.starovoytov.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component//по умолчанию - id = rockMusic
public class RockMusic implements Music{

    @Override
    public String getSong() {
        int idSong = (int) (Math.random() * songs.size());
        return songs.get(idSong);
    }

//лекция 8. init-method, destroy-method, factory-method
//    public void doInitRockMusic(){
//        System.out.println("Doing initialization RockMusic(создание bean rockMusic)");
//    }
//    public void doDestroyRockMusic(){
//        System.out.println("Doing destruction RockMusic(уничтожение bean rockMusic)");
//    }
//    //чтобы ограничить создание объектов класса, нужно сделать приватный конструктор
//    private RockMusic(){} // эот говорит о том, что мы хотим использовать фабричный метод(он всегда статический)
//    public static RockMusic getRockMusic(){
//        return new RockMusic();
//    }//фабричный метод

//лекция 11. Внедрение зависимости. Annotation @Qualifier("")
    private List<String> songs = new ArrayList<>();

    {
        songs.add("rockMusic_1");
        songs.add("rockMusic_2");
        songs.add("rockMusic_3");
    }

}
