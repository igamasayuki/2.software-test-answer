package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestSample {

	public static boolean isPositiveNumber(int i) {
		if (i > 0) {
			return true;
		} else {
			return false;
		}
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 100 })
	void positiveNumber(int n) {
		assertTrue(isPositiveNumber(n));
	}

	@ParameterizedTest
	@ValueSource(strings = { "Java", "java", "JAVA" })
	void upperCace(String s) {
		assertEquals("JAVA", s.toUpperCase());
	}

}
