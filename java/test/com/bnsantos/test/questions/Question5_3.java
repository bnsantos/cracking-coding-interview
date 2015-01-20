package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter5.Question3;

public class Question5_3 {

	@Test
	public void test() {
		Assert.assertEquals(8, Question3.getNext(4));
		Assert.assertEquals(10168, Question3.getPrev(10115));
	}

}
