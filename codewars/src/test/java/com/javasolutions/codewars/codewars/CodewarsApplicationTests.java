package com.javasolutions.codewars.codewars;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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
		assertEquals("42 -9", HighAndLow.highAndLowFinder("8 3 -5 42 -1 0 0 -9 4 7 4 -4")
					, "Must return 42 for High and -9 for Low");
	}

	@Test
	public void shouldReturnExesAndOhsAreEquals() {
		assertTrue(ExesAndOhs.getXO("ooxx"), "Must be true. Two ohs and two exes");
		assertTrue(ExesAndOhs.getXO("asdfksee"), "Must be true. None ohs and exes");
		assertFalse(ExesAndOhs.getXO("zzoo"), "Must be false. Only two ohs and noe exes.");
		assertFalse(ExesAndOhs.getXO("Xxxxxxxxertr34"), "Must be false.");
		assertTrue(ExesAndOhs.getXO("ooxXm"),"Must be true. Two ohs and two exes");
	}

	@Test
	public void shouldReverseAnString() {
		assertEquals("dlrow", ReversedString.reverseString("world"), "The string must be dlrow.");
		assertEquals("AsAc", ReversedString.reverseString("cAsA"), "Must consider case sensitive.");
		assertEquals("zevahC nauJ", ReversedString.reverseString("Juan Chavez"), "Must consider spaces between words.");
	}

}
