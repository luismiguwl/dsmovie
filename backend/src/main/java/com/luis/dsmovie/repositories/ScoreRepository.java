package com.luis.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luis.dsmovie.entities.Score;
import com.luis.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
}
