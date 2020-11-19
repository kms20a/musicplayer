package com.kosta.musicplayer.domain;

import javax.persistence.*;

@Entity
public class Track {
    @Id
    private long id;
    private String title;
    private String albumTitle;
    private String genreName;
    private float rating;
    private int len;
    private int count;

    @ManyToOne
//    @JoinColumn(name = "ALBUM_ID")
    private Album album;

    @ManyToOne
//    @JoinColumn(name = "GENRE_ID")
    private Genre genre;

    public long getId() {  return id; }
    public void setId(long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAlbumTitle() { return albumTitle; }
    public void setAlbumTitle(String albumTitle) { this.albumTitle = albumTitle; }
    public String getGenreName() { return genreName; }
    public void setGenreName(String genreName) { this.genreName = genreName; }
    public float getRating() { return rating; }
    public void setRating(float rating) { this.rating = rating; }
    public int getLen() { return len; }
    public void setLen(int len) { this.len = len; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}
