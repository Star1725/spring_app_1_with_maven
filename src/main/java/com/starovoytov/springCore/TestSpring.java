package com.starovoytov.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //данный объект прочитает кофигурационный файл applicationContext, где описаны beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//лекция 4
//        //указывем какой конкретно bean мы хотим достать и кладём его в переменную тогоже класса
//        Music music = context.getBean("musicBean", Music.class);
//
//        MusicPlayer player = new MusicPlayer(music);
//        player.playMusic();
//        context.close();

//лекция 5. Dependency Injection с помощью конструктора и xml
//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic();
//        context.close();

//лекция 6. Dependency Injection с помощью setter, внедрение простых значений в качестве зависимомти, внедрение значений из внешнего файла
//создаём файл свойств musicPlayer.properties
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println("PlayerName: " + player.getName() + ", PlayerVolume: " + player.getVolume());
        player.playMusic();
        System.out.println("Playing musicList:");
        player.playMusicList();
        context.close();

    }
}
