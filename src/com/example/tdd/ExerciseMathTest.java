package com.example.tdd;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ExerciseMathTest {

	@Test
	void _1を渡すと1が返る() {
		// 準備
		ExerciseMath exerciseMath = new ExerciseMath();
		// 実行
		int actual = exerciseMath.factorial(1);
		// 検証
		assertEquals(1, actual);
	}
	
	@Test
	void _2を渡すと2が返る() {
		// 準備
		ExerciseMath exerciseMath = new ExerciseMath();
		// 実行
		int actual = exerciseMath.factorial(2);
		// 検証
		assertEquals(2, actual);
		
		
	}
	
	
	
}
