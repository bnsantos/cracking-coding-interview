package com.bnsantos.test.questions;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question2;

public class Question2_2 {

	@Test
	public void test() {
		StringBuffer nth = new StringBuffer();
		Question2.nthToLast(Arrays.asList(1,2,3,4,5,6,7,8,9,0), 3, nth);
		Assert.assertEquals("8", nth.toString());
	}

}
