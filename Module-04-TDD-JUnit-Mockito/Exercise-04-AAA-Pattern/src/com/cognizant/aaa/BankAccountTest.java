package com.cognizant.aaa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {

        account = new BankAccount(1000);

        System.out.println("Setup executed");
    }

    @AfterEach
    void tearDown() {

        System.out.println("Teardown executed");
    }

    @Test
    void testDeposit() {

        // Arrange
        double depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(
                1500,
                account.getBalance()
        );
    }
}