package com.kosta.musicplayer.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Genre {
    @Id
//    @Column(name = "GENRE_ID")
    private long id;
    private String name;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private List<Track> tracks;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
