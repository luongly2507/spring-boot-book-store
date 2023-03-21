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
@RequestMapping("/api/v1/categories")
public class CategoryController {
    @GetMapping
    public ResponseEntity<?> getAllCategories(){
        return ResponseEntity.ok("Get all categories");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoryById(@PathVariable UUID id){
        return ResponseEntity.ok("Get category by id");
    }
    @PostMapping
    public ResponseEntity<?> addCategory(CreateAuthorRequest CreateAuthorRequest ){
        return ResponseEntity.ok("Add category");
    }
    @PatchMapping("/{id}")
    public ResponseEntity<?> patchCategory(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest){
        return ResponseEntity.ok("Patch category");
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateCategory(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest){
        return ResponseEntity.ok("Update category");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable UUID id){
        return ResponseEntity.ok("Delete category");
    }
}
