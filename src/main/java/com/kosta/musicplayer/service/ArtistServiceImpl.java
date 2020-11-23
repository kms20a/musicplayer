package com.kosta.musicplayer.service;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArtistServiceImpl implements ArtistService {

    @Autowired
    private ArtistRepository ar;

    @Override
    public List<Artist> getArtists() {
        return ar.findAll();
    }
}
