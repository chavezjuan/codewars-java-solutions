package com.javasolutions.codewars.codewars;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodewarsApplication {

	public static void main(String[] args) {

		System.out.println(NumbersDivisors.numberOfDivisors(12));

	}
}
