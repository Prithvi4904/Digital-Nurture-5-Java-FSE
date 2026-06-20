# Exercise 01 - Singleton Pattern

## Objective

Implement the Singleton Design Pattern to ensure that only one `Logger` object is created and reused throughout the application.

## Problem Statement

Applications often need one shared instance for services such as logging, configuration, or database connections. This exercise demonstrates how to restrict object creation and provide a single global access point.

## Implementation Details

| File | Responsibility |
| --- | --- |
| `Logger.java` | Singleton class with a private constructor, static instance, and `getInstance()` method |
| `SingletonTest.java` | Driver class that verifies both logger references point to the same object |

## Design Pattern Used

Creational Design Pattern: Singleton

Key points:

- Constructor is private, so objects cannot be created directly from outside the class.
- A static variable stores the single instance.
- `getInstance()` returns the same object whenever it is called.
- The test compares two references using `==` to confirm that both refer to the same instance.

## How to Run

Run these commands from the repository root:

```powershell
javac -d Module-1-Design-Patterns/Exercise-01-SingletonPattern/out Module-1-Design-Patterns/Exercise-01-SingletonPattern/src/com/cognizant/singleton/*.java
```

```powershell
java -cp Module-1-Design-Patterns/Exercise-01-SingletonPattern/out com.cognizant.singleton.SingletonTest
```

## Expected Output

```text
Logger instance created
[LOG] Application started
[LOG] User logged in

Same Instance : true
```

## Learning Outcome

This exercise demonstrates controlled object creation, shared resource access, and how Singleton helps maintain a single consistent instance across an application.
