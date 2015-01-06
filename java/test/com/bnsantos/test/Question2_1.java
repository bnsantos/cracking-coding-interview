package com.bnsantos.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter2.Question1;

public class Question2_1 {

	@Test
	public void testBuffer() {
		List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,2,2,2,2,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,3,3,3,3,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,3,4,5,5,5,5,6,7,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,3,4,5,6,7,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicates(Arrays.asList(1,2,3,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9)));
	}
	
	@Test
	public void testNoBuffer() {
		List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,2,2,2,2,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,3,3,3,3,3,4,5,5,5,5,6,7,7,7,7,8,8,8,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,3,4,5,5,5,5,6,7,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,3,4,5,6,7,8,9)));
		Assert.assertEquals(expected, Question1.removeDuplicatesNoBuffer(Arrays.asList(1,2,3,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9)));
	}

}
