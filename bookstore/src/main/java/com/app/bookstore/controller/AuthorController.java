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

import com.app.bookstore.payload.request.CreateAuthorRequest;
import com.app.bookstore.payload.request.UpdateAuthorRequest;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
    @GetMapping
    public ResponseEntity<?> getAllAuthors() {
        return ResponseEntity.ok("Get All Authors");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable UUID id) {
        return ResponseEntity.ok("Get Author Detail");

    }

    @PostMapping
    public ResponseEntity<?> createAuthor(CreateAuthorRequest createAuthorRequest) {
        return ResponseEntity.ok("Đã tạo tác giả");

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAuthor(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest) {
        return ResponseEntity.ok("Put");

    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchAuthor(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest) {
        return ResponseEntity.ok("Patch");

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuthor(@PathVariable UUID id) {
        return ResponseEntity.ok("Đã xóa ");

    }
}
