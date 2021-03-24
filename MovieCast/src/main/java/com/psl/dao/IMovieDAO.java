package com.psl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.psl.entity.Movie;

@Repository
public interface IMovieDAO extends JpaRepository<Movie, String>{
	
//	Movie findByNameAndLanguage(String name,String language);
	Movie findByNameAndLanguageAndDirector(String name,String language,String director);
}
