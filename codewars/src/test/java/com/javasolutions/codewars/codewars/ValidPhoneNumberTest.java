package com.javasolutions.codewars.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ValidPhoneNumberTest {

    @Test
    @DisplayName("Should be a valid phone number")
    public void should_validPhoneNumber_WithSuccess() {
        assertTrue(ValidPhoneNumber.validPhoneNumber("(123) 456-7890"), "(123) 456-7890 is a valid phone number");
    }

    @Test
    @DisplayName("Should be a invalid phone number")
    public void shouldNot_validPhoneNumber_WithSuccess() {
        assertAll(
                "Invalid phone number tests",
                () -> assertFalse(ValidPhoneNumber.validPhoneNumber("(1111)555 2345"), "Must be not valid. Should be 3 numbers between parenthesis and space after."),
                () -> assertFalse(ValidPhoneNumber.validPhoneNumber("(098) 123 4567"), "Must be not valid. Should have \"-\" between numbers."),
                () -> assertFalse(ValidPhoneNumber.validPhoneNumber("(111)555-2345"), "Must be invalid. Should have a space after the parenthesis."),
                () -> assertFalse(ValidPhoneNumber.validPhoneNumber("(111) 555-23451"), "Must be invalid. Should have only four numbers in the last part of the phone number."),
                () -> assertFalse(ValidPhoneNumber.validPhoneNumber("(111) 5554-2345"), "Must be invalid. Should have only three numbers in the first part of the phone number.")
        );
    }
}
