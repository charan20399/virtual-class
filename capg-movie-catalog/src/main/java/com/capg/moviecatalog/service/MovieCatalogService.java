package com.capg.moviecatalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.moviecatalog.model.MovieCatalog;
import com.capg.moviecatalog.repo.MovieCatalogRepo;
@Service
public class MovieCatalogService {

	@Autowired
	MovieCatalogRepo repo;
	public MovieCatalog getMovieCatalog(long id) {
		return repo.getOne(id);
	}
	public List<MovieCatalog> getAllMovieCatalog(){
		return repo.findAll();
	}
	public MovieCatalog addMovieCatalog(MovieCatalog movie) {
		return repo.save(movie);
	}
}
