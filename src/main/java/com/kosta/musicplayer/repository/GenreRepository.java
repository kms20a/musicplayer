package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// GenreRepository에서는 Genre 엔티티를 사용하며 키값은 Long 형임을 알려줌
@RepositoryRestResource
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
