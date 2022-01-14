package com.luis.dsmovie.dto;

import com.luis.dsmovie.entities.Movie;

public class MovieDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;

	public MovieDTO() {
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Double getScore() {
		return score;
	}

	public Integer getCount() {
		return count;
	}

	public String getImage() {
		return image;
	}

}
