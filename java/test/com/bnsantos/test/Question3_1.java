package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question1;

public class Question3_1 {

	@Test(expected=Exception.class)
	public void test1() throws Exception {
		Question1.FixedArrayStack stack = new Question1.FixedArrayStack(3);
		stack.push(0, 15);
		stack.push(1, 20);
		stack.push(2, 25);
		stack.push(0, 30);
		stack.push(0, 35);
		stack.push(1, 40);
		stack.push(1, 45);
		stack.push(2, 50);
		stack.push(2, 55);
		stack.push(2, 60);
		stack.push(1, 65);
		
		Assert.assertEquals(35, stack.pop(0));
		Assert.assertEquals(30, stack.pop(0));
		Assert.assertEquals(15, stack.pop(0));
		
		Assert.assertEquals(60, stack.pop(2));
		Assert.assertEquals(65, stack.pop(1));
		Assert.assertEquals(45, stack.pop(1));
		Assert.assertEquals(40, stack.pop(1));
		Assert.assertEquals(40, stack.pop(0));
	}
}
