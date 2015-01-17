package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter1.Question4;

public class Question1_4 {

	@Test
	public void testOk() {
		Assert.assertEquals("Mr%20John%20Smith", Question4.replaceSpaces(new char[]{'M', 'r', ' ', 'J','o','h','n',' ','S','m','i','t','h'}, 13));
	}
	
	@Test
	public void testFalse() {
		Assert.assertNotEquals("Mr%20John%20Smith%20", Question4.replaceSpaces(new char[]{'M', 'r', ' ', 'J','o','h','n',' ','S','m','i','t','h'}, 13));
	}

}
