package com.book.libraryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Initiating Book Library Service Application.
 */
@SpringBootApplication
@EnableJpaRepositories
public class BookLibraryServiceApplication {
	/**
	 * Main method to start the application.
	 *
	 * @param args - Main method arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(BookLibraryServiceApplication.class, args);
	}

}
