package com.kosta.musicplayer.repository;

import com.kosta.musicplayer.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// ArtistRepository에서는 Artist 엔티티를 사용하며 키값은 Long 형임을 알려줌
@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    //가져올 항목을 기준으로 메소드명 작성
    //List<Artist> findByName(String name);
//    @Query("SELECT a from Artist a WHERE a.name = ?1")
    @Query("SELECT a from Artist a WHERE a.name = :name") //JPQL
//    @Query(value = "dldkdkdj", nativeQuery = true)    //NATIVE QUERY
    List<Artist> findmmmmmm(String name);
}
