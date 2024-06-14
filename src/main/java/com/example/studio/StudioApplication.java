package com.example.studio;

import com.example.studio.model.Book;
import com.example.studio.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudioApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudioApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository){
		return args -> {
			repository.save(new Book(null, "Mi", 3123, "Marco Antonio Flores"));
		};
	}

}
