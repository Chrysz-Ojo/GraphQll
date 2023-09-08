package com.example.graphqlapplication;

import com.example.graphqlapplication.model.Book;
import com.example.graphqlapplication.repository.BookRepository;
import com.example.graphqlapplication.review.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class GraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return args -> {
            Book reactiveSpring = new Book("Reactive Spring", 484, "Josh Long");
            Review review = new Review("Great book","I really enjoyed this book");
            reactiveSpring.setReviews(List.of(review));
            bookRepository.save(reactiveSpring);

        };
    }
}
