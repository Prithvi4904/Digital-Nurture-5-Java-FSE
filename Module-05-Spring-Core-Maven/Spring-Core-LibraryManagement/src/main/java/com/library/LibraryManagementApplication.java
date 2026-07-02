package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        System.out.println("Starting Library Management Application...");

        // Load the Spring Application Context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the context
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration to verify dependency injection
        System.out.println("\nTesting Dependency Injection:");
        bookService.saveBook();

        System.out.println("\nApplication finished successfully.");
    }
}
