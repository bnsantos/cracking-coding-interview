package com.bnsantos.test.questions;

import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter7.Question5;
import com.bnsantos.chapter7.Question5.Line;

public class Question7_5 {

	@Test
	public void test() {
		Question5.Square square1 = new Question5.Square(new Point(0, 0), new Point(8, 8));
		Question5.Square square2 = new Question5.Square(new Point(2, 3), new Point(6, 7));
		
		Assert.assertEquals(new Point(4, 4), square1.middle());
		Assert.assertEquals(new Point(4, 5), square2.middle());
		
		Line cutLine = square1.cut(square2);
		Assert.assertEquals(new Point(4,0), cutLine.getStart());
		Assert.assertEquals(new Point(4,8), cutLine.getEnd());
	}

}
