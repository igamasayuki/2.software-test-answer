package com.example;

public class MathUtil {
	/**
	 * num1のnum2乗を求める.
	 * 
	 * <pre>
	 * お客様ヒアリングの結果 
	 * num1の境界値は0,1
	 * num2の境界値は-1,0,1
	 * とします。
	 * </pre>
	 * 
	 * @param num1
	 *            ベースになる数
	 * @param num2
	 *            指数
	 * @return num1のnum2乗
	 * @throws IlligalArgmentException
	 *             num1またはnum2が100以上の時に発生する (この時例外オブジェクトには「100以上の値は不正です」と含める)
	 */
	public static double power(int num1, int num2) {
		if (num1 >= 100 || num2 >= 100) {
			throw new IllegalArgumentException("100以上の値は不正です");
		}
		return Math.pow(num1, num2);
	}
}
