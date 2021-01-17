package com.javasolutions.codewars.codewars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodewarsApplicationTests {

	@Test
	public void checkIfZeroShouldReturnEven() {
		EvenOrOdd tester = new EvenOrOdd();

		assertEquals("Even", tester.even_or_odd(0), "0 number must be even");
	}

}
