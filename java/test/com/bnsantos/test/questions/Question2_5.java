package com.bnsantos.test.questions;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question5;

public class Question2_5 {

	@Test
	public void testReverse() {
		Assert.assertEquals(Arrays.asList(2,1,9), Question5.addReverse(Arrays.asList(7,1,6), Arrays.asList(5,9,2)));
	}
	
	@Test
	public void testForward() {
		Assert.assertEquals(Arrays.asList(9,1,2), Question5.addForward(Arrays.asList(6,1,7), Arrays.asList(2,9,5)));
	}

}
