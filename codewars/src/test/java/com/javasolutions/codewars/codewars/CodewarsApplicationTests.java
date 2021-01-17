package com.javasolutions.codewars.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodewarsApplicationTests {

	@Test
	public void checkIfZeroShouldReturnEven() {
		assertEquals("Even", EvenOrOdd.even_or_odd(0), "0 number must be even");
	}

	@Test
	public void testEvenOrOdd() {
		assertEquals("Even", EvenOrOdd.even_or_odd(6), "Even number must be even");
		assertEquals("Odd", EvenOrOdd.even_or_odd(7), "Odd number must be odd");
	}

}
