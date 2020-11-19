package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

// TrackRepository에서는 Track 엔티티를 사용하며 키값은 Long 형임을 알려줌
public interface TrackRepository extends JpaRepository<Track, Long> {

}