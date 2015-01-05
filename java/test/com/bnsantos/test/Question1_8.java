package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question8;

public class Question1_8 {

	@Test
	public void testOk() {
		Assert.assertTrue(Question8.isRotation("abc", "bca"));
		Assert.assertTrue(Question8.isRotation("waterbottle", "erbottlewat"));
	}
	
	@Test
	public void testFail(
			) {
		Assert.assertFalse(Question8.isRotation("abc", "cba"));
		Assert.assertFalse(Question8.isRotation("abc", "abcd"));
	}

}
