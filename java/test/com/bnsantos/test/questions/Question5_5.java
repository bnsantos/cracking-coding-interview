package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter5.Question5;

public class Question5_5 {

	@Test
	public void test() {
		Assert.assertEquals(0, Question5.bitSwap(15, 15));
		Assert.assertEquals(2, Question5.bitSwap(29, 15));
	}

}
