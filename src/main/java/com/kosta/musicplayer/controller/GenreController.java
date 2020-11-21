package com.kosta.musicplayer.controller;

import com.kosta.musicplayer.domain.Genre;
import com.kosta.musicplayer.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/genres")
public class GenreController {
    @Autowired
    private GenreRepository gr;

    @GetMapping
    public List<Genre> getGenres() {
        return gr.findAll();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable long id){
        return gr.findById(id).get();
    }

    @PostMapping
    public Genre postGenre(@RequestBody Genre genre){
        return gr.save(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable("id") long id){
        gr.deleteById(id);
    }

    @PutMapping("/{id}")
    public Genre updateGenre(@PathVariable("id") long id, @RequestBody Genre genre){
        Genre result_genre = gr.findById(id).get();
        result_genre.setName(genre.getName());
        return gr.save(result_genre);
    }
}
