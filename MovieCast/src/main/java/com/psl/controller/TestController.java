package com.psl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.psl.entity.Movie;
import com.psl.service.TestService;

@RestController
public class TestController {

	@Autowired	
	private TestService ts;
	
//	@GetMapping("/{name}")
//	public Movie findByNameAndLanguage(@PathVariable String name,@RequestParam String language)
//	{		                 
//		return ts.findByNameAndLanguage(name,language);
//	}
	
	@GetMapping("/{name}")
	public Movie findByNameAndLanguageAndDirector(@PathVariable String name,@RequestParam String language,@RequestParam String director)
	{		                 
		return ts.findByNameAndLanguageAndDirector(name,language,director);
	}
	@GetMapping("/movie/{name}")
	public Movie getBymoviename(@PathVariable String name)
	{		                 
		return ts.getBymoviename(name);
	}
	@PostMapping("/movie")
	public void addMovie(@RequestBody Movie e)
	{
		System.out.println("Movie added");
		ts.addMovie(e);
	}
}
