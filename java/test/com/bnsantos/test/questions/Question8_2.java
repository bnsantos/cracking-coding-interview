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
		Call call = new Call(new Caller("Bruno"), Rank.DIRECTOR, 1000);
		Call call1 = new Call(new Caller("Bruno2"), Rank.RESPONDENT, 1000);
		Call call2 = new Call(new Caller("Bruno3"), Rank.MANAGER, 1000);
		Call call3 = new Call(new Caller("Bruno4"), Rank.RESPONDENT, 1000);
		Call call4 = new Call(new Caller("Bruno5"), Rank.DIRECTOR, 1000);
		Call call5 = new Call(new Caller("Bruno6"), Rank.RESPONDENT, 1000);
		Call call6 = new Call(new Caller("Bruno7"), Rank.MANAGER, 1000);
		callCenter.handleCall(call);
		callCenter.handleCall(call1);
		callCenter.handleCall(call2);
		callCenter.handleCall(call3);
		callCenter.handleCall(call4);
		callCenter.handleCall(call5);
		callCenter.handleCall(call6);
		callCenter.waitCalls();
		Assert.assertTrue(call.isDone());
		Assert.assertEquals("Respondent-Manager-Director--Finished!-", call.printHistory());
	}

}
