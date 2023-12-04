package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MathUtilTestParameterizedTestCsvSource {

	@Test
	void testPower1() {
		double actualAnswer = MathUtil.power(0, -2);
		assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります");
	}

	@Test
	void testPower2() {
		double actualAnswer = MathUtil.power(0, -1);
		assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC2:期待値と実際の結果が異なります");
	}
	
	// パラメタライズドテストサンプル TC3〜TC20
	@ParameterizedTest
	@CsvSource({
		// num1の値, num2の値, 結果
		"0, 0, 1", //TC3
		"0, 1, 0", //TC4
		"0, 2, 0", //TC5
		"1,-2, 1", //TC6
		"1,-1, 1", //TC7
		"1, 0, 1", //TC8
		"1, 1, 1", //TC9
		"1, 2, 1", //TC10
		"-1,-2, 1", //TC11
		"-1,-1,-1", //TC12
		"-1, 0, 1", //TC13
		"-1, 1,-1", //TC14
		"-1, 2, 1", //TC15
		"2,-2, 0.25", //TC16
		"2,-1, 0.5", //TC17
		"2, 0, 1", //TC18
		"2, 1, 2", //TC19
		"2, 2, 4", //TC20
	})
	void num1のnum2乗を求めるメソッドのテスト(int num1, int num2, double expectedResult) {
		double actualAnswer = MathUtil.power(num1, num2);
		assertEquals(expectedResult, actualAnswer, "TC1:期待値と実際の結果が異なります");
		System.out.println(Double.POSITIVE_INFINITY);
	}
	
	/**
	 * 例外が発生するか検証
	 */
	@Test
	void testPower21() {
		try {
			MathUtil.power(100, 0);
			fail("TC21:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("100以上の値は不正です", e.getMessage(), "TC21:期待値と実際の結果が異なります");
		}
	}

	/**
	 * 例外が発生するか検証
	 */
	@Test
	public void testPower22() {
		try {
			MathUtil.power(0, 1000);
			fail("TC22:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertEquals("100以上の値は不正です", e.getMessage(), "TC22:期待値と実際の結果が異なります");
		}
	}

}
