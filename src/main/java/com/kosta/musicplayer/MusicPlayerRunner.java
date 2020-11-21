package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Album;
import com.kosta.musicplayer.domain.Genre;
import com.kosta.musicplayer.domain.Track;
import com.kosta.musicplayer.repository.AlbumRepository;
import com.kosta.musicplayer.repository.GenreRepository;
import com.kosta.musicplayer.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

//@Component
public class MusicPlayerRunner implements ApplicationRunner {
    @Autowired
    TrackRepository trackRepository;

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    GenreRepository genreRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Track track = new Track();
        track.setId(1);
        track.setTitle("곡명 : 여름..안에서");
        track.setAlbumTitle("여름");
        track.setGenreName("발라드");
        track.setRating(1.5f);
        track.setLen(180);
        track.setCount(4);

        Album album = new Album();
        album.setId(1);
        album.setName("DUCE");
        album.setDate(new Date());
        track.setAlbum(album);
        albumRepository.save(album);

        Genre genre = new Genre();
        genre.setId(1);
        genre.setName("발라드");
        track.setGenre(genre);
        genreRepository.save(genre);

        trackRepository.save(track);

    }
}
