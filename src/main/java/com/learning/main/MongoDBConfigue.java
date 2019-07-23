package com.learning.main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.learning.repository.MovieRepository;

@EnableMongoRepositories(basePackages = "com.learning.repository")
@Configuration
public class MongoDBConfigue {
	@Bean
	CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
		return null;
	}
}

