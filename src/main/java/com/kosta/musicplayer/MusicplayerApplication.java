package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Track;
import com.kosta.musicplayer.repository.TrackRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicplayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicplayerApplication.class, args);
        System.out.println("111111111111111");
        Track a = new Track();
        a.setId(1);
        a.setTitle("111");
        //final Track track = TrackRepository
    }

}
