package com.sergei.spring.mongo.myspring_with_mongo;

import com.sergei.spring.mongo.myspring_with_mongo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MyspringWithMongoApplication implements CommandLineRunner {

	@Autowired
	PlayerRepository playerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyspringWithMongoApplication.class, args);
	}

	@Override
	public void run(final String... args) throws Exception {

	}
}
