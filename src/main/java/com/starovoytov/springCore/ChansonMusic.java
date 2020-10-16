package com.starovoytov.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ChansonMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("chansonMusic_1");
        songs.add("chansonMusic_2");
        songs.add("chansonMusic_3");
    }

    @Override
    public String getSong() {
        int idSong = (int) (Math.random() * songs.size());
        return songs.get(idSong);
    }
}
