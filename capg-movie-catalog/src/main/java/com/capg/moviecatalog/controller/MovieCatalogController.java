package com.capg.moviecatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.moviecatalog.model.MovieCatalog;
import com.capg.moviecatalog.service.MovieCatalogService;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	MovieCatalogService service;
	@GetMapping("/id/{id}")
	public MovieCatalog getMovieCatalaog(@PathVariable long id) {
		return service.getMovieCatalog(id);
	}
	
	@GetMapping("/all")
	public List<MovieCatalog> getAllMovieCatalog(){
		return service.getAllMovieCatalog();
	}
	
	@PostMapping("/add")
	public MovieCatalog addMovieCatalog(MovieCatalog movie) {
		return service.addMovieCatalog(movie);
	}
	
}
