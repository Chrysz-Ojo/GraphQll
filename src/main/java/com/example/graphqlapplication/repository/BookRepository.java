package com.example.graphqlapplication.repository;

import com.example.graphqlapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
