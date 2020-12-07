package com.springjpa.demo.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.springjpa.demo.document.Users;
import com.springjpa.demo.repository.UserRepository;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

	@Bean
	CommandLineRunner commandLinerunner(UserRepository userRepo)
	{
		return Strings -> {
			userRepo.save(new Users(1, "Paul", "DevOps", 25000L ));
			userRepo.save(new Users(2, "Ryan", "Prod", 45000L ));
			userRepo.save(new Users(3, "Jeff", "Testing", 55000L ));
		};
	}
}
