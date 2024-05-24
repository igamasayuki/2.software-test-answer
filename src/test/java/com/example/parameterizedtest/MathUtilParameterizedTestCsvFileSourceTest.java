package com.example.parameterizedtest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import com.example.MathUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MathUtilParameterizedTestCsvFileSourceTest {

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
	@CsvFileSource(resources = "MathUtilParameterizedTestCsvFileSourceTest.csv")
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
