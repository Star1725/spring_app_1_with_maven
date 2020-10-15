package com.starovoytov.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //данный объект прочитает кофигурационный файл applicationContext, где описаны beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //указывем какой конкретно bean мы хотим достать и кладём его в переменную тогоже класса
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer player = new MusicPlayer(music);
        //выведем объект в консоль
        player.playMusic();
        context.close();
    }


}
