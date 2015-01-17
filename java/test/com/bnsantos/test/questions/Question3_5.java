package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question5;

public class Question3_5 {

	@Test
	public void test1() {
		Question5.MyQueue myQueue = new Question5.MyQueue();
		myQueue.add(5);
		myQueue.add(7);
		myQueue.add(3);
		myQueue.add(8);
		myQueue.add(0);
		Assert.assertEquals(5, myQueue.remove());
		Assert.assertEquals(7, myQueue.remove());
		myQueue.add(9);
		myQueue.add(15);
		myQueue.add(33);
		myQueue.add(87);
		myQueue.add(10);
		myQueue.add(6);
		Assert.assertEquals(3, myQueue.remove());
		Assert.assertEquals(8, myQueue.remove());
		Assert.assertEquals(0, myQueue.remove());
		
		Assert.assertEquals(9, myQueue.remove());
		Assert.assertEquals(15, myQueue.remove());
	}

}
