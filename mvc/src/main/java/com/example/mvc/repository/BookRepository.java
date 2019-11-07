package com.example.mvc.repository;

import com.example.mvc.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    List<Book> findAll();
    List<Book> findByDescriptionContaining(String search);
    Optional<Book> findById(Long id);
    void deleteById(Long id);
}
