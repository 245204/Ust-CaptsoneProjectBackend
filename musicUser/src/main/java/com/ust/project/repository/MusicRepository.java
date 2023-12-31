package com.ust.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.project.model.Music;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

	Music findByMusicName(String musicName);

	List<Music> findAllBySongReleaseDate(String songReleaseDate);

	List<Music> findAllByArtistName(String artistName);

	List<Music> findAllByMusicGenre(String musicGenre);

}
