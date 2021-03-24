package com.psl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
     	
	@Id	
	private String name;
	private String language;
	private String director;
	private int yearofrelease;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYearofrelease() {
		return yearofrelease;
	}
	public void setYearofrelease(int yearofrelease) {
		this.yearofrelease = yearofrelease;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", director=" + director + ", yearofrelease="
				+ yearofrelease + "]";
	}
	public Movie(String name, String language, String director, int yearofrelease) {		
		this.name = name;
		this.language = language;
		this.director = director;
		this.yearofrelease = yearofrelease;
	}
	public Movie() {
	}
	
	
}
