package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question6;

public class Question1_6 {
	@Test
	public void testOk() {
		Assert.assertEquals("7 4 1 8 5 2 9 6 3 ", Question6.print(Question6.rotate90(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
	}
	
	@Test
	public void testFail() {
		Assert.assertNotEquals("7 8 1 8 5 2 9 6 3 ", Question6.print(Question6.rotate90(new int[][]{{1,2,3},{4,5,6},{7,8,9}})));
	}

}
