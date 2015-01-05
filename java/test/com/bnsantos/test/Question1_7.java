package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question6;
import com.bnsantos.chapter1.Question7;

public class Question1_7 {

	@Test
	public void testOk1() {
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Question7.zeroes(matrix);
		Assert.assertEquals("1 2 3 4 5 6 7 8 9 ", Question6.print(matrix));
	}
	
	@Test
	public void testOk2() {
		int[][] matrix = new int[][]{{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,0,16}};
		Question7.zeroes(matrix);
		Assert.assertEquals("1 0 0 4 0 0 0 0 9 0 0 12 0 0 0 0 ", Question6.print(matrix));
	}
	
	@Test
	public void testFail1() {
		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,0,16}};
		Question7.zeroes(matrix);
		Assert.assertNotEquals("1 0 0 4 0 0 0 0 9 0 0 12 0 0 0 0 ", Question6.print(matrix));
	}

}
