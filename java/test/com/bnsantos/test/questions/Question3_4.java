package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question4;

public class Question3_4 {

	@Test
	public void test1() {
		Question4.HanoiTower hanoiTower = new Question4.HanoiTower(5);
		Assert.assertEquals("Tower[1] 4 3 2 1 0 Tower[2] Tower[3] ", hanoiTower.toString());
		hanoiTower.solve();
		Assert.assertEquals("Tower[1] Tower[2] Tower[3] 4 3 2 1 0 ", hanoiTower.toString());
	}
	
	@Test
	public void test2() {
		Question4.HanoiTower hanoiTower = new Question4.HanoiTower(10);
		Assert.assertEquals("Tower[1] 9 8 7 6 5 4 3 2 1 0 Tower[2] Tower[3] ", hanoiTower.toString());
		hanoiTower.solve();
		Assert.assertEquals("Tower[1] Tower[2] Tower[3] 9 8 7 6 5 4 3 2 1 0 ", hanoiTower.toString());
	}

}
