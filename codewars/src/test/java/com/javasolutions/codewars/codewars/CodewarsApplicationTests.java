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

	@Test
	public void shouldReturnMaxAndMinFromString() {
		assertEquals("42 -9", highAndLow.highAndLowFinder("8 3 -5 42 -1 0 0 -9 4 7 4 -4")
					, "Must return 42 for High and -9 for Low");
	}

}
