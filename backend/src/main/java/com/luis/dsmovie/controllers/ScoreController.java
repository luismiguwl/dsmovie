package com.luis.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.dsmovie.dto.MovieDTO;
import com.luis.dsmovie.dto.ScoreDTO;
import com.luis.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = scoreService.saveScore(dto);
		return movieDTO;
	}
	
	// salvar de forma indepotente -> salvou mais de uma vez? tem o mesmo efeito de salvar uma vez só
}
