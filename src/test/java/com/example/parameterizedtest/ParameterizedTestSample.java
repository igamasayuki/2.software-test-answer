package com.example.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	void upperCase(String s) {
		assertEquals("JAVA", s.toUpperCase());
	}

}
