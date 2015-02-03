package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter7.Question3;
import com.bnsantos.chapter7.Question3.Line;

public class Question7_3 {

	@Test
	public void testNoInterception() {
		Line l1 = new Question3.Line(0.3, 5);
		Line l2 = new Question3.Line(0.3, 15);
		Assert.assertFalse(l1.intersect(l2));
	}
	
	@Test
	public void testInterception() {
		Line l1 = new Question3.Line(0.3, 5);
		Line l2 = new Question3.Line(0.8, 15);
		Assert.assertTrue(l1.intersect(l2));
	}

}
