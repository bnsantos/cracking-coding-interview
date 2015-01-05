package com.bnsantos.test;


import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question5;

public class Question1_5 {

	@Test
	public void testOk() {
		Assert.assertEquals("a2b1c5a3", Question5.compress("aabcccccaaa"));
		Assert.assertEquals("ab", Question5.compress("ab"));
		Assert.assertEquals("abcd", Question5.compress("abcd"));
	}

	@Test
	public void testFail() {
		Assert.assertNotEquals("a1b1", Question5.compress("ab"));
		Assert.assertNotEquals("a1b1c1", Question5.compress("abc"));
	}
}
