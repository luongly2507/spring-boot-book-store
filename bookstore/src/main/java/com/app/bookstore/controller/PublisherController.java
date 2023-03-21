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
@RequestMapping ("/api/v1/publishers")
public class PublisherController {
    @GetMapping
    public ResponseEntity<?> getAllPublishers(){
        return ResponseEntity.ok("get All Publishers");
    }
    @GetMapping ("/id")
    public ResponseEntity<?> getPublisherById(@PathVariable UUID id){
        return ResponseEntity.ok("get Publisher details");
    }
    @PostMapping
    public ResponseEntity<?> createPublisher(CreateAuthorRequest createAuthorRequest){
        return ResponseEntity.ok("create Publisher");
    }
    @PutMapping
    public ResponseEntity<?> updatePublisher(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest){
        return ResponseEntity.ok("update Publisher");
    }
    @PatchMapping
    public ResponseEntity<?> patchPublisher(@PathVariable UUID id, UpdateAuthorRequest updateAuthorRequest){
        return ResponseEntity.ok("patch Publisher");
    }
    @DeleteMapping
    public ResponseEntity<?> deletePublisher(@PathVariable UUID id){
        return ResponseEntity.ok("delete Publisher");
    }
}
