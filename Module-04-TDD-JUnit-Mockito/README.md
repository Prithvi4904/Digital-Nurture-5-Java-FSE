# Module 4: TDD, JUnit & Mockito 🚀

This module contains hands-on exercises focused on Test-Driven Development (TDD), unit testing with **JUnit 5**, and mocking dependencies with **Mockito**. 

The exercises are structured to incrementally build an understanding of writing robust, maintainable, and isolated tests in Java.

## 📂 Project Structure & Exercises

The module is broken down into the following specific exercises:

1. **`Exercise-01-SettingUpJUnit`**
   * **Goal:** Understand the basics of setting up and running a simple JUnit 5 test.
   * **Contents:** A basic `Calculator` class and a corresponding `CalculatorTest` using `@Test` and basic assertions.

2. **`Exercise-03-AssertionsInJUnit`**
   * **Goal:** Explore the different types of assertions available in JUnit 5.
   * **Contents:** Demonstrations of `assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, and `assertNotNull`.

3. **`Exercise-04-AAA-Pattern`**
   * **Goal:** Learn how to structure tests using the **A**rrange-**A**ct-**A**ssert pattern and lifecycle hooks.
   * **Contents:** A `BankAccount` class and a test suite utilizing the `@BeforeEach` and `@AfterEach` setup/teardown annotations.

4. **`Exercise-05-MockingAndStubbing`**
   * **Goal:** Learn how to isolate code by replacing external dependencies with "Mocks".
   * **Contents:** Using Mockito to `mock()` an `ExternalApi` and `stub` its behavior using `when(...).thenReturn(...)` inside `MyServiceTest`.

5. **`Exercise-06-VerifyingInteractions`**
   * **Goal:** Learn how to verify that specific methods on a mock object were called.
   * **Contents:** Using Mockito's `verify(...)` method to ensure a service interacts with its dependencies correctly.

## 🛠️ Setup & Compilation

This project uses **Maven**. The `pom.xml` has been specially configured using the `build-helper-maven-plugin` to recognize all the custom `Exercise-*/src` folders as valid test sources. 

This means your IDE (VS Code, IntelliJ, Eclipse) will automatically resolve the JUnit and Mockito dependencies for all exercises without needing to move files around.

* **Java Version:** 17
* **JUnit Version:** 5.10.2
* **Mockito Version:** 5.11.0
