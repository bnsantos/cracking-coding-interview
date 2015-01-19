package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter5.Question2;

public class Question5_2 {

	@Test
	public void test() {
		Assert.assertEquals("ERROR", Question2.printBinary(15));
		Assert.assertEquals("ERROR", Question2.printBinary(-15));
		Assert.assertEquals("ERROR", Question2.printBinary(0.3));
	}

}
