package com.jacieljm.solid.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BlueDebitCardTest {
    private BlueDebitCard blueDebitCard;

    @BeforeEach
    void setUp() {
        blueDebitCard = new BlueDebitCard();
    }

    @Test
    void shouldDoTransaction() {
        String expectedOutput = "100 trxn done with debit card";
        String output = blueDebitCard.doTransaction(100);
        // Assert that the output matches the expected output
        assertEquals(expectedOutput, output);
    }

    @Test
    void shouldDeposit() {
        // Assuming the deposit method has some logic to test
        // For now, just ensure it doesn't throw any exceptions
        assertDoesNotThrow(() -> blueDebitCard.deposit("123456", 1000));
    }

    @Test
    void shouldWithdraw() {
        // Assuming the withdrawal method has some logic to test
        // For now, just ensure it doesn't throw any exceptions
        assertDoesNotThrow(() -> blueDebitCard.withdraw("123456", 500));
    }
}