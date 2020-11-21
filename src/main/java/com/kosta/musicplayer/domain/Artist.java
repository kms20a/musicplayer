package com.kosta.musicplayer.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//  @Column(name = "ARTIST_ID")
    private long id;
    private String name;

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY)
    private List<Album> albums;
}
