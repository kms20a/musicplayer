package com.kosta.musicplayer;

import com.kosta.musicplayer.domain.Artist;
import com.kosta.musicplayer.repository.ArtistRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MusicplayerApplicationTests {

    @Autowired
    private ArtistRepository ar;

    @Autowired
    private TestRestTemplate template;

    //@Test
    void contextLoads() {
    }

    //@Test
    void createArtistTest(){
        Artist a = new Artist();
        a.setName("태진아");
        ar.save(a);
        Artist result = ar.findByName("태진아").get(0);
        assertEquals(a.getName(), a.getName());
    }

    @Test
    void createArtistApiTest(){
        Artist a = new Artist();
        a.setName("송대관");
        template.postForEntity("/artists", a, Artist.class);

        ResponseEntity<Artist> response =
        template.getForEntity("/artists/1", Artist.class);

        assertEquals(response.getBody().getName(), a.getName());
    }


}
