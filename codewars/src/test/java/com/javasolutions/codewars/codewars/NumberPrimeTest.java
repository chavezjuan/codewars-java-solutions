package com.javasolutions.codewars.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class NumberPrimeTest {

    @Test
    @DisplayName("Should negative number not a prime number")
    public void should_negativeNotPrimeNumber_WithSuccess() {
        assertFalse(NumberPrime.isPrime(-1), "-1 is not a prime number");
    }

    @Test
    @DisplayName("Should zero number not a prime number")
    public void should_zeroNotPrimeNumber_WithSuccess() {
        assertFalse(NumberPrime.isPrime(0));
    }

    @Test
    @DisplayName("Should not be a prime number")
    public void should_NotPrimeNumber_WithSuccess() {

        assertAll(
                "should not",
                () -> assertFalse(NumberPrime.isPrime(4), "4 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(6), "6 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(8), "8 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(9), "9 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(45), "45 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(-5), "-5 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(-8), "-8 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(-41), "-41 is not prime")
        );
    }

    @Test
    @DisplayName("Should be a prime number")
    public void should_PrimeNumber_WithSuccess() {

        assertAll(
                "should",
                () -> assertTrue(NumberPrime.isPrime(3), "3 is prime"),
                () -> assertTrue(NumberPrime.isPrime(5), "5 is prime"),
                () -> assertTrue(NumberPrime.isPrime(7), "7 is prime"),
                () -> assertTrue(NumberPrime.isPrime(41), "41 is prime"),
                () -> assertTrue(NumberPrime.isPrime(5099), "5099 is prime")
        );
    }

    @Test
    @DisplayName("Should return a response below 2 seconds")
    public void shouldNot_Timeout_WithSuccess() {

        assertTimeout(
                Duration.ofSeconds(2),
                () -> {
                    NumberPrime.isPrime(5099);
                }
        );
    }

    @Test
    @DisplayName("Should recognize big numbers")
    public void should_recognizeBigNumbers_WithSuccess() {
        assertAll(
                "should",
                () -> assertFalse(NumberPrime.isPrime(460299229), "460299229 is not prime"),
                () -> assertFalse(NumberPrime.isPrime(7921), "7921 is not prime")
        );

    }
}
