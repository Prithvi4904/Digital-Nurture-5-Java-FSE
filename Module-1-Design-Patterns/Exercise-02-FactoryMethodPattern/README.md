# Exercise 02 - Factory Method Pattern

## Objective

Implement the Factory Method Design Pattern to create different document objects without exposing the object creation logic to the client code.

## Problem Statement

A document management system must support multiple document types such as Word, PDF, and Excel. Instead of creating objects directly in the client class, the creation responsibility is delegated to factory classes.

## Implementation Details

| File | Responsibility |
| --- | --- |
| `Document.java` | Product interface with the common `open()` operation |
| `WordDocument.java` | Concrete product for Word documents |
| `PdfDocument.java` | Concrete product for PDF documents |
| `ExcelDocument.java` | Concrete product for Excel documents |
| `DocumentFactory.java` | Abstract creator that declares `createDocument()` |
| `WordDocumentFactory.java` | Concrete factory that creates `WordDocument` |
| `PdfDocumentFactory.java` | Concrete factory that creates `PdfDocument` |
| `ExcelDocumentFactory.java` | Concrete factory that creates `ExcelDocument` |
| `FactoryMethodTest.java` | Driver class that creates and opens each document through factories |

## Design Pattern Used

Creational Design Pattern: Factory Method

Key points:

- Client code depends on the abstract `DocumentFactory` and `Document` types.
- Each concrete factory decides which document object to create.
- New document types can be added by creating a new product and factory class.
- Object creation is separated from object usage.

## How to Run

Run these commands from the repository root:

```powershell
javac -d Module-1-Design-Patterns/Exercise-02-FactoryMethodPattern/out Module-1-Design-Patterns/Exercise-02-FactoryMethodPattern/src/com/cognizant/factory_method/*.java
```

```powershell
java -cp Module-1-Design-Patterns/Exercise-02-FactoryMethodPattern/out com.cognizant.factory_method.FactoryMethodTest
```

## Expected Output

```text
Opening Word Document
Opening PDF Document
Opening Excel Document
```

## Learning Outcome

This exercise demonstrates loose coupling, abstraction-based programming, and how Factory Method improves maintainability when multiple related object types need to be created.
