package com.app.bookstore.service;

import java.util.List;
import java.util.UUID;

import com.app.bookstore.entity.Book;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(UUID id);
    public Book addBook(Book book);
    public Book updateBook(UUID id, Book book);
    public void deleteBook(UUID id);
    public List<Book> searchBooks(String search);
}
