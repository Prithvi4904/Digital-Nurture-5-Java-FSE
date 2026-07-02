package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    // Constructor for Dependency Injection (Exercise 7)
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter for Dependency Injection (Exercise 7)
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void saveBook() {
        System.out.println("BookService: Attempting to save a book at library: " + libraryName);
        if (bookRepository != null) {
            bookRepository.save();
        } else {
            System.out.println("BookService: bookRepository is null. Injection failed!");
        }
    }
}
