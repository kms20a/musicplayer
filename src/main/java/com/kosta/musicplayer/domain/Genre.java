package com.kosta.musicplayer.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Genre {
    @Id
//    @Column(name = "GENRE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private List<Track> tracks;
}
