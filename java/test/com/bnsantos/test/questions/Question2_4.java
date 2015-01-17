package com.bnsantos.test.questions;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question4;

public class Question2_4 {

	@Test
	public void test() {
		Assert.assertEquals(Arrays.asList(3,2,1,8,5,6,7,9), Question4.partition(Arrays.asList(8,3,5,6,7,2,1,9), 4));
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9), Question4.partition(Arrays.asList(7,1,8,2,9,3,4,5,6), 7));
	}

}
