package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question2;

public class Question3_2 {

	@Test(expected=Exception.class)
	public void test1() throws Exception {
		Question2.StackWithMin stack = new Question2.StackWithMin();
		stack.push(9);
		stack.push(15);
		stack.push(8);
		stack.push(7);
		stack.push(7);
		stack.push(22);
		stack.push(23);
		stack.push(4);
		stack.push(99);

		Assert.assertEquals(4, stack.min());
		Assert.assertEquals(99, stack.pop());
		
		Assert.assertEquals(4, stack.min());
		Assert.assertEquals(4, stack.pop());
		
		Assert.assertEquals(7, stack.min());
		Assert.assertEquals(23, stack.pop());
		
		Assert.assertEquals(7, stack.min());
		Assert.assertEquals(22, stack.pop());
		
		Assert.assertEquals(7, stack.min());
		Assert.assertEquals(7, stack.pop());
		
		Assert.assertEquals(7, stack.min());
		Assert.assertEquals(7, stack.pop());
		
		Assert.assertEquals(8, stack.min());
		Assert.assertEquals(8, stack.pop());
		
		Assert.assertEquals(9, stack.min());
		Assert.assertEquals(15, stack.pop());
		
		Assert.assertEquals(9, stack.min());
		Assert.assertEquals(9, stack.pop());
		
		Assert.assertEquals(-1, stack.pop());
	}

}
