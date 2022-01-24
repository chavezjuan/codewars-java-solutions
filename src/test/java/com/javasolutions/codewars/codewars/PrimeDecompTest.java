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
        assertEquals("(2**5)(5)(7**2)(11)", PrimeDecomp.factors(86240), "The decomposition must be (2**5)(5)(7**2)(11)");
    }
}
