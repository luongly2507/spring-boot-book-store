package com.app.bookstore.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bookstore.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
    
}
