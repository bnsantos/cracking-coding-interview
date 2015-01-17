package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question3;


public class Question1_3 {

	@Test
	public void testOk() {
		Assert.assertTrue(Question3.permutation("abc", "bca"));
		Assert.assertTrue(Question3.permutation("iii", "iii"));
		Assert.assertTrue(Question3.permutation("54321", "12345"));
		Assert.assertTrue(Question3.permutation("12345", "23451"));
		Assert.assertTrue(Question3.permutation("abcdefgh", "edfbcagh"));
		Assert.assertTrue(Question3.permutation("---222", "---222"));
		Assert.assertTrue(Question3.permutation(" () l", " () l"));
	}
	
	@Test
	public void testFalse() {
		Assert.assertFalse(Question3.permutation("abc", ""));
		Assert.assertFalse(Question3.permutation("abc", "abca"));
		Assert.assertFalse(Question3.permutation("aabc", "bbca"));
		Assert.assertFalse(Question3.permutation("=-", "-=-"));
		Assert.assertFalse(Question3.permutation("456", "123"));
		Assert.assertFalse(Question3.permutation("iii", "iiio"));
		Assert.assertFalse(Question3.permutation("abcd", "0987"));
	}

}

