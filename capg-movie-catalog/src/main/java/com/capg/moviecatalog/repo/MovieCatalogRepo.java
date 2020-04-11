package com.capg.moviecatalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.moviecatalog.model.MovieCatalog;

public interface MovieCatalogRepo extends JpaRepository<MovieCatalog, Long>{

}
