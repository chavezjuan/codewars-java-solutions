package com.javasolutions.codewars.codewars;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PrimeDecompTest {
    @Test
    @DisplayName("Should the number be decomposed in prime numbers successfully")
    public void should_primeFactorDecomposition_WithSuccess() {

        assertAll(
                "Should decompose in prime numbers correctly",
                () -> assertEquals(
                        "(2**5)(5)(7**2)(11)",
                        PrimeDecomp.factors(86240),
                        "The decomposition must be (2**5)(5)(7**2)(11)"
                ),
                () -> assertEquals(
                        "(2**2)(3**3)(5)(7)(11**2)(17)",
                        PrimeDecomp.factors(7775460),
                        "The decomposition must be (2**2)(3**3)(5)(7)(11**2)(17)"
                )
        );
    }

    @Test
    @DisplayName("Should prime number be decomposed correctly")
    public void should_primeNumbersDecomposition_WithSuccess() {

        assertAll(
                "Should decompose prime numbers correctly",
                () -> assertEquals(
                        "(13)",
                        PrimeDecomp.factors(13),
                        "13 is prime, so result must be (13)"
                ),
                () -> assertEquals(
                        "(5099)",
                        PrimeDecomp.factors(5099),
                        "5099 is prime, so result must be (5099)"
                )
        );
    }
}
