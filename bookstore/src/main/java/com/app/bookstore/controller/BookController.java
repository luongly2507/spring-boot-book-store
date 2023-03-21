package com.app.bookstore.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookstore.payload.request.CreateBookRequest;
import com.app.bookstore.payload.request.UpdateBookRequest;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    
    @GetMapping
    public ResponseEntity<?> getAllBooks() {
        return ResponseEntity.ok("Get All Books");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBookById(@PathVariable UUID id) {
        return ResponseEntity.ok("Get Book Detail");

    }

    @PostMapping
    public ResponseEntity<?> createBook(CreateBookRequest createBookRequest) {
        return ResponseEntity.ok("Đã tạo sách");

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBook(@PathVariable UUID id, UpdateBookRequest updateBookRequest) {
        return ResponseEntity.ok("Put");

    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchBook( @PathVariable UUID id, UpdateBookRequest updateBookRequest) {
        return ResponseEntity.ok("Patch");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable UUID id) {
        return ResponseEntity.ok("Đã xóa sách");

    }
}
