package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter5.Question1;

public class Question5_1 {

	@Test
	public void test() {
		Assert.assertEquals(2048+4+8+64, Question1.updateBits(2048, 19, 2, 6));
	}

}
