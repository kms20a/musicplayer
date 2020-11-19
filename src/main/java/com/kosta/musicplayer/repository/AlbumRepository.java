package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// AlbumRepository에서는 Album 엔티티를 사용하며 키값은 Long 형임을 알려줌
public interface AlbumRepository extends JpaRepository<Album, Long> {

}