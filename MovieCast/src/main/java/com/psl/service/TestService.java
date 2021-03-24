package com.psl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.psl.dao.IMovieDAO;
import com.psl.entity.Movie;

@Service
public class TestService {
    @Autowired
	private IMovieDAO d;
    	
	public Movie getBymoviename(String name)
	{
		return d.findById(name).get();
	}
	public Movie findByNameAndLanguageAndDirector(String name,String language,String director) 
	{	
		return d.findByNameAndLanguageAndDirector(name,language,director);
	}
//    public Movie findByNameAndLanguage(String name,String language)
//	{
//    	
//		return d.findByNameAndLanguage(name,language);
//	}
	public void addMovie(Movie e)
	{
		d.save(e);
		System.out.println("Employee has been added with id "+e);
	}	
	public void updateMovie(Movie e)
	{
		d.save(e);
		System.out.println("Employee has been updated of id "+ e);
	}	
}
