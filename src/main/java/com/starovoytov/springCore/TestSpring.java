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
//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("PlayerName: " + player.getName() + ", PlayerVolume: " + player.getVolume());
//        player.playMusic();
//        System.out.println("Playing musicList:");
//        player.playMusicList();
//        context.close();

//лекция 7. Scope
//        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        //если Scope для Bean по-умолчанию singelton, то объукты указывают на один и тотже участок памяти по-этому == выведет true,
//        //если Scope - prototype, то false (разные участки памяти)
//        System.out.println(firstPlayer == secondPlayer);
//        //т.к. в классе MusicPlayer не переопределён toString, по-этому sout покажет хеши этих объктов. если Scope по-умолчанию - они равны,
//        //если Scope - prototype, то хеши разные
//        System.out.println(firstPlayer);
//        System.out.println(secondPlayer);
//        firstPlayer.setVolume(10);
//        System.out.println();
//        System.out.println("SecondPlayerVolume: " + secondPlayer.getVolume());
//
//        System.out.println("FirstPlayerName: " + firstPlayer.getName() + ", FirstPlayerVolume: " + firstPlayer.getVolume());
//        firstPlayer.playMusic();
//        System.out.println("Playing musicList from :");
//        firstPlayer.playMusicList();
//        context.close();

//лекция 8. init-method и destroy-method. factory-method
//        //Так как scope - singelton, то Spring создаст через factory-method только оди объект. И при вызове context.getBean будет давать ссылку на этот объект
//        // init-method вызовится до context.getBean()
//        RockMusic rockMusic = context.getBean("rockMusicBean", RockMusic.class);//при использовании factory-method ничего не должно поменяться
//        System.out.println(rockMusic.getSong());
//        //destroy-method вызовится до context.close();
//        context.close();

//лекция 9. Annotation
//        RockMusic rockMusic = context.getBean("someRockMusic", RockMusic.class);
//        System.out.println(rockMusic.getSong());
//        context.close();

//лекция 10. Внедрение зависимости. Annotation @Autowired
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        context.close();

//лекция 11. Внедрение зависимости. Annotation @Qualifier("")
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
