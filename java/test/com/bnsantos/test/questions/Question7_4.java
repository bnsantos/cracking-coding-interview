package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter7.Question4;

public class Question7_4 {

	@Test
	public void test() {
		Assert.assertEquals(5, Question4.abs(-5));
		Assert.assertEquals(5, Question4.divide(15, 3));
		Assert.assertEquals(531, Question4.minus(865, 334));
		Assert.assertEquals(112, Question4.multiply(8, 14));
		Assert.assertEquals(-851, Question4.negate(851));
	}

}
