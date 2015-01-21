package com.bnsantos.test.questions;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import com.bnsantos.chapter5.Question7;
import com.bnsantos.utils.BitInteger;

public class Question5_7 {

	@Test
	public void test() {
        Random rand = new Random(); 
        int n = rand.nextInt(300000) + 1;
        int missing = rand.nextInt(n+1);
        ArrayList<BitInteger> array = Question7.initialize(n, missing);
        org.junit.Assert.assertEquals(missing, Question7.findMissing(array));
	}
}
