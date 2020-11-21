package com.kosta.musicplayer.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Album {
    @Id
    //@Column(name = "ALBUM_ID")
    private long id;
    String name;
    Date date;

    @ManyToOne
    @JoinColumn(name = "ARTIST_ID")
    private Artist artist;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Track> track;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) { this.date = date; }

    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
