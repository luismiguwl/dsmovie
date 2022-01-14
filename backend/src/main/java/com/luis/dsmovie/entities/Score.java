package com.luis.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePk id = new ScorePk();
	private Double value;
	
	public Score() {
	}

	public ScorePk getId() {
		return id;
	}

	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
}
