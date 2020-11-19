package com.kosta.musicplayer.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artist {
    @Id
//  @Column(name = "ARTIST_ID")
    private long id;
    private String name;

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY)
    private List<Album> albums;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Album> getAlbums() { return albums; }
    public void setAlbums(List<Album> albums) { this.albums = albums; }
}
