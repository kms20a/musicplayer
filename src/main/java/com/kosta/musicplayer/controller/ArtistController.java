package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }

    @RequestMapping("/hello2")
    public Artist hello2(){
        Artist artist = new Artist();
        artist.setName("송대관");
        return artist;
    }
}
