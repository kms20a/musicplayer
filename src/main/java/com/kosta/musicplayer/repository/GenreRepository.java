package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

// GenreRepository에서는 Genre 엔티티를 사용하며 키값은 Long 형임을 알려줌
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
