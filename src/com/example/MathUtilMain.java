package com.example;

/**
 * MathUtilクラスのテスト.
 * <pre>
 * JUnitを使わない場合は、mainメソッドの中でメソッドを実行し、
 * 目視で確認する必要があった。
 * これだと毎回テスト結果を目視で確認する手間が発生するし、
 * 見落としをしてしまうこともある
 * </pre>
 * 
 * @author igamasayuki
 *
 */
public class MathUtilMain {

	public static void main(String[] args) {

		double answer1 = MathUtil.power(0, -2);
		System.out.println(answer1);
		
		double answer2 = MathUtil.power(0, -1);
		System.out.println(answer2);
		
		double answer3 = MathUtil.power(0, 0);
		System.out.println(answer3);
	}

}
