package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// AlbumRepository에서는 Album 엔티티를 사용하며 키값은 Long 형임을 알려줌
@RepositoryRestResource
public interface AlbumRepository extends JpaRepository<Album, Long> {

}