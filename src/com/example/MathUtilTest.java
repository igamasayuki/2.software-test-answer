package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilTest {

	/**
	 * <pre>
	 * 全テスト実行前に１度だけ実行されるセットアップメソッド.
	 * 全てのテストに共通する前処理を行う際に使用する。
	 * 例えば、全テストで利用するテストデータを作るためのSQL
	 * を実行するなど。
	 * </pre>
	 * 
	 * @throws Exception 今回は例外は発生しない
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()の呼出し。全テスト実行前に１度だけ実行される");
	}

	/**
	 * <pre>
	 * 全テスト実行後に１度だけ実行されるメソッド.
	 * 例えば、使用したテストデータを削除し、初期化する処理など。
	 * </pre>
	 * 
	 * @throws Exception 今回は例外は発生しない
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()の呼出し。全テスト実行後に１度だけ実行される");
	}

	/**
	 * <pre>
	 * 各テスト実行前に毎回実行されるメソッド.
	 * 各テストで共通した前処理があればこちらに処理を書く。
	 * 同じ情報が詰まったインスタンスを作成する処理など。
	 * </pre>
	 * 
	 * @throws Exception 今回は例外は発生しない
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp()の呼出し。各テスト実行前に毎回実行される");
	}

	/**
	 * <pre>
	 * 各テスト実行後に毎回実行されるメソッド.
	 * 各テストで共通した後処理があればこちらに処理を書く。
	 * テストで使用したインスタンス(オブジェクト)は自動的にメモリから
	 * 削除されるため、このメソッドはあまり利用の機会はない。
	 * </pre>
	 * 
	 * @throws Exception 今回は例外は発生しない
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown()の呼出し。各テスト実行後に毎回実行される");
	}

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

	@Test
	void testPower3() {
		double actualAnswer = MathUtil.power(0, 0);
		assertEquals(1.0, actualAnswer, "TC3:期待値と実際の結果が異なります");
	}

	@Test
	void testPower4() {
		double actualAnswer = MathUtil.power(0, 1);
		assertEquals(0.0, actualAnswer, "TC4:期待値と実際の結果が異なります");
	}

	@Test
	void testPower5() {
		double actualAnswer = MathUtil.power(0, 2);
		assertEquals(0.0, actualAnswer, "TC5:期待値と実際の結果が異なります");
	}

	@Test
	void testPower6() {
		double actualAnswer = MathUtil.power(1, -2);
		assertEquals(1.0, actualAnswer, "TC6:期待値と実際の結果が異なります");
	}

	@Test
	void testPower7() {
		double actualAnswer = MathUtil.power(1, -1);
		assertEquals(1.0, actualAnswer, "TC7:期待値と実際の結果が異なります");
	}

	@Test
	void testPower8() {
		double actualAnswer = MathUtil.power(1, 0);
		assertEquals(1.0, actualAnswer, "TC8:期待値と実際の結果が異なります");
	}

	@Test
	void testPower9() {
		double actualAnswer = MathUtil.power(1, 1);
		assertEquals(1.0, actualAnswer, "TC9:期待値と実際の結果が異なります");
	}

	@Test
	void testPower10() {
		double actualAnswer = MathUtil.power(1, 2);
		assertEquals(1.0, actualAnswer, "TC10:期待値と実際の結果が異なります");
	}

	@Test
	void testPower11() {
		double actualAnswer = MathUtil.power(-1, -2);
		assertEquals(1.0, actualAnswer, "TC11:期待値と実際の結果が異なります");
	}

	@Test
	void testPower12() {
		double actualAnswer = MathUtil.power(-1, -1);
		assertEquals(-1.0, actualAnswer, "TC12:期待値と実際の結果が異なります");
	}

	@Test
	void testPower13() {
		double actualAnswer = MathUtil.power(-1, 0);
		assertEquals(1.0, actualAnswer, "TC13:期待値と実際の結果が異なります");
	}

	@Test
	void testPower14() {
		double actualAnswer = MathUtil.power(-1, 1);
		assertEquals(-1.0, actualAnswer, "TC14:期待値と実際の結果が異なります");
	}

	@Test
	void testPower15() {
		double actualAnswer = MathUtil.power(-1, 2);
		assertEquals(1.0, actualAnswer, "TC15:期待値と実際の結果が異なります");
	}

	@Test
	void testPower16() {
		double actualAnswer = MathUtil.power(2, -2);
		assertEquals(0.25, actualAnswer, "TC16:期待値と実際の結果が異なります");
	}

	@Test
	void testPower17() {
		double actualAnswer = MathUtil.power(2, -1);
		assertEquals(0.5, actualAnswer, "TC17:期待値と実際の結果が異なります");
	}

	@Test
	void testPower18() {
		double actualAnswer = MathUtil.power(2, 0);
		assertEquals(1.0, actualAnswer, "TC18:期待値と実際の結果が異なります");
	}

	@Test
	void testPower19() {
		double actualAnswer = MathUtil.power(2, 1);
		assertEquals(2.0, actualAnswer, "TC19:期待値と実際の結果が異なります");
	}

	@Test
	void testPower20() {
		double actualAnswer = MathUtil.power(2, 2);
		assertEquals(4.0, actualAnswer, "TC20:期待値と実際の結果が異なります");
	}

	/**
	 * 例外が発生するか検証
	 */
	@Test
	void testPower21() {
		IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
				() -> MathUtil.power(100, 0));
		assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC21:期待値と実際の結果が異なります");
	}

	/**
	 * 例外が発生するか検証
	 */
	@Test
	void testPower22() {
		IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
				() -> MathUtil.power(0, 100));
		assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC22:期待値と実際の結果が異なります");
	}
	
	// 以下でも大丈夫ですが少し古い書き方です。
//	@Test
//	void testPower21() {
//		try {
//			MathUtil.power(100, 0);
//			fail("TC21:例外が発生しなければなりません");
//		} catch (IllegalArgumentException e) {
//			assertEquals("100以上の値は不正です", e.getMessage(), "TC21:期待値と実際の結果が異なります");
//		}
//	}
//	/**
//	 * 例外が発生するか検証
//	 */
//	@Test
//	public void testPower22() {
//		try {
//			MathUtil.power(0, 1000);
//			fail("TC22:例外が発生しなければなりません");
//		} catch (IllegalArgumentException e) {
//			assertEquals("100以上の値は不正です", e.getMessage(), "TC22:期待値と実際の結果が異なります");
//		}
//	}

}
