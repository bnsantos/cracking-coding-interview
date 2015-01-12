package com.bnsantos.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question3;

public class Question3_3 {

	@Test(expected=Exception.class)
	public void test1() throws Exception {
		Question3.SetOfStacks stack = new Question3.SetOfStacks();
		
		stack.push(20);
		stack.push(21);
		stack.push(22);
		stack.push(23);
		stack.push(24);
		
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);
		
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		stack.push(5);

		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		Assert.assertEquals(1, stack.pop());
		Assert.assertEquals(2, stack.pop());
		Assert.assertEquals(3, stack.pop());
		
		Assert.assertEquals(5, stack.pop());
		Assert.assertEquals(6, stack.pop());
		Assert.assertEquals(7, stack.pop());
		Assert.assertEquals(8, stack.pop());
		Assert.assertEquals(9, stack.pop());
		
		Assert.assertEquals(19, stack.popAt(1));
		Assert.assertEquals(24, stack.popAt(0));
		Assert.assertEquals(14, stack.popAt(2));
		
		Assert.assertEquals(13, stack.pop());
		Assert.assertEquals(12, stack.pop());
		Assert.assertEquals(11, stack.pop());
		Assert.assertEquals(10, stack.pop());
		
		Assert.assertEquals(18, stack.popAt(1));
		Assert.assertEquals(23, stack.popAt(0));

		Assert.assertEquals(17, stack.pop());
		Assert.assertEquals(16, stack.pop());
		Assert.assertEquals(15, stack.pop());
		
		Assert.assertEquals(20, stack.pop());
		Assert.assertEquals(21, stack.pop());
		Assert.assertEquals(22, stack.pop());
		
		Assert.assertEquals(-1, stack.pop());
	}

}
