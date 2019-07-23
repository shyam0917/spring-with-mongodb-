package com.learning.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.learning.movie.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String> {

	List<Movie> findByTitle(String text);
	Movie findByTitleAndContent(String title,String content);
	 Optional<Movie> findById(String id);
	 void deleteById(String id);
}
