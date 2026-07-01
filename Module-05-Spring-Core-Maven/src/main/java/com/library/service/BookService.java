package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook() {
        System.out.println("BookService: Attempting to save a book...");
        if (bookRepository != null) {
            bookRepository.save();
        } else {
            System.out.println("BookService: bookRepository is null. Injection failed!");
        }
    }
}
