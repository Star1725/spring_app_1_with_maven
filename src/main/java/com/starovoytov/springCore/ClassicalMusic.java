package com.starovoytov.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("classicalMusic_1");
        songs.add("classicalMusic_2");
        songs.add("classicalMusic_3");
    }

    @Override
    public String getSong() {
        int idSong = (int) (Math.random() * songs.size());
        return songs.get(idSong);
    }
}
