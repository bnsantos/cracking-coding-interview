package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter8.question2.Call;
import com.bnsantos.chapter8.question2.CallCenter;
import com.bnsantos.chapter8.question2.Caller;
import com.bnsantos.chapter8.question2.Rank;

public class Question8_2 {

	@Test
	public void test() {
		CallCenter callCenter = new CallCenter(1, 1, 1);
		Call call = new Call(new Caller("Bruno"), Rank.DIRECTOR);
		callCenter.handleCall(call);
		
		Assert.assertTrue(call.isDone());
		Assert.assertEquals("Respondent-Manager-Director--Finished!-", call.printHistory());
	}

}
