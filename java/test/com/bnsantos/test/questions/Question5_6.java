package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter5.Question6;

public class Question5_6 {

	@Test
	public void test() {
		Assert.assertEquals(42, Question6.swapOddEvenBits(21));
	}
}
