package com.app.bookstore.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bookstore.entity.Publisher;
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, UUID>{
    
}
