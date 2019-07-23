package com.learning.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.repository.MovieRepository;
import com.learning.movie.Movie;


@RestController
public class MovieController {

	@Autowired
	MovieRepository movieRepository;
	

	@GetMapping("/movie")
	public List<Movie> index() {
	return movieRepository.findAll();
	}

	@GetMapping("/movie/id={id}")
	public Optional<Movie> show(@PathVariable String id) {
		return movieRepository.findById(id);
	}

	@PostMapping("/movie/title={movieName}")
	public List<Movie> searchResults(@PathVariable String movieName) {
		return movieRepository.findByTitle(movieName);

	}

	@PostMapping("/movie/create")
	public Movie create(@RequestBody Map<String, String> body) {
		String title = body.get("title");
		String content = body.get("content");
		return movieRepository.save(new Movie(title,content));
	}

	@PutMapping("/movie/update/{id}")
	public Movie update(@PathVariable String id, @RequestBody Movie body) {
		return movieRepository.save(body);
	}

	@DeleteMapping("movie/delete/{id}")
	public boolean delete(@PathVariable String id) {
		movieRepository.deleteById(id);
		return true;

	}
}
