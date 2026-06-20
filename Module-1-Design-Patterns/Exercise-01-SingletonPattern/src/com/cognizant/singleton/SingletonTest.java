package com.cognizant.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in");

        System.out.println();
        System.out.println("Same Instance : " + (logger1 == logger2));
    }
}