package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciseMathTest {

	@Test
	void testFactorial1() {
		try {
			ExerciseMath.factorial(-1);
			fail("TC1:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("0以下の値は不正です。", e.getMessage(), "TC1:メッセージが一致しません");
		}
	}
	
	@Test
	void testFactorial2() {
		try {
			ExerciseMath.factorial(0);
			fail("TC2:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("0以下の値は不正です。", e.getMessage(), "TC2:メッセージが一致しません");
		}
	}
	
	@Test
	void testFactorial3() {
		int actualAnswer = ExerciseMath.factorial(1);
		assertEquals(1, actualAnswer, "TC3:値が一致しません");
	}
	
	@Test
	void testFactorial4() {
		int actualAnswer = ExerciseMath.factorial(2);
		assertEquals(2, actualAnswer, "TC4:値が一致しません");
	}
	
	@Test
	void testFactorial5() {
		int actualAnswer = ExerciseMath.factorial(3);
		assertEquals(6, actualAnswer, "TC5:値が一致しません");
	}
	
	@Test
	void testFactorial6() {
		int actualAnswer = ExerciseMath.factorial(4);
		assertEquals(24, actualAnswer, "TC6:値が一致しません");
	}
	
	@Test
	void testFactorial7() {
		int actualAnswer = ExerciseMath.factorial(11);
		assertEquals(39916800, actualAnswer, "TC7:値が一致しません");
	}
	
	@Test
	void testFactorial8() {
		int actualAnswer = ExerciseMath.factorial(12);
		assertEquals(479001600, actualAnswer, "TC8:値が一致しません");
	}
	
	@Test
	void testFactorial9() {
		try {
			ExerciseMath.factorial(13);
			fail("TC9:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("13以上の値は不正です。", e.getMessage(), "TC9:メッセージが一致しません");
		}
	}
	
	@Test
	void testFactorial10() {
		try {
			ExerciseMath.factorial(14);
			fail("TC10:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("13以上の値は不正です。", e.getMessage(), "TC14:メッセージが一致しません");
		}
	}

}
