package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

// ArtistRepository에서는 Artist 엔티티를 사용하며 키값은 Long 형임을 알려줌
public interface ArtistRepository extends JpaRepository<Artist, Long> {

}
