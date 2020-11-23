package com.kosta.musicplayer.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Album {
    @Id
    //@Column(name = "ALBUM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String name;
    Date date;

    @ManyToOne
    @JoinColumn(name = "ARTIST_ID")
    private Artist artist;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY)
    private List<Track> track;
}
