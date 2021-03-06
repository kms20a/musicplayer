package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Track;
import com.kosta.musicplayer.repository.TrackRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicplayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicplayerApplication.class, args);
        System.out.println("MusicplayerApplication");
    }

}
