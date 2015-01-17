package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question6;

public class Question3_6 {

	@Test
	public void test() {
		Question6.Stack stack = new Question6.Stack();
		stack.push(8);
		stack.push(7);
		stack.push(9);
		stack.push(1);
		stack.push(4);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(6);
		stack.push(0);
		Assert.assertEquals("8 7 9 1 4 5 3 2 6 0 ", stack.toString());
		Assert.assertEquals("0 1 2 3 4 5 6 7 8 9 ", Question6.sortStack(stack).toString());
	}
}
