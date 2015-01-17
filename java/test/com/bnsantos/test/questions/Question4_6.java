package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question6;
import com.bnsantos.utils.TreeNodeParent;

public class Question4_6 {
	private TreeNodeParent mRoot, mN7, mN3, mN8, mN14, mN11;
	
	@Before
	public void init(){
		mRoot = new TreeNodeParent("7");
		TreeNodeParent n1 = new TreeNodeParent("3");
		TreeNodeParent n2 = new TreeNodeParent("11");
		TreeNodeParent n3 = new TreeNodeParent("1");
		TreeNodeParent n4 = new TreeNodeParent("5");
		TreeNodeParent n5 = new TreeNodeParent("9");
		TreeNodeParent n6 = new TreeNodeParent("13");
		TreeNodeParent n7 = new TreeNodeParent("0");
		TreeNodeParent n8 = new TreeNodeParent("2");
		TreeNodeParent n9 = new TreeNodeParent("4");
		TreeNodeParent n10 = new TreeNodeParent("6");
		TreeNodeParent n11 = new TreeNodeParent("8");
		TreeNodeParent n12 = new TreeNodeParent("10");
		TreeNodeParent n13 = new TreeNodeParent("11");
		TreeNodeParent n14 = new TreeNodeParent("14");
		
		mRoot.setLeft(n1);
		mRoot.setRight(n2);
		n1.setParent(mRoot);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setParent(mRoot);
		n2.setLeft(n5);
		n2.setRight(n6);
		n3.setParent(n1);
		n3.setLeft(n7);
		n3.setRight(n8);
		n4.setParent(n1);
		n4.setLeft(n9);
		n4.setRight(n10);
		n5.setParent(n2);
		n5.setLeft(n11);
		n5.setRight(n12);
		n6.setParent(n2);
		n6.setLeft(n13);
		n6.setRight(n14);
		
		n7.setParent(n3);
		n8.setParent(n3);
		n9.setParent(n4);
		n10.setParent(n4);
		n11.setParent(n5);
		n12.setParent(n5);
		n13.setParent(n6);
		n14.setParent(n6);
		
		mN7 = n7;
		mN3 = n3;
		mN8 = n8;
		mN14 = n14;
		mN11 = n11;
	}

	@Test
	public void test1() {
		Assert.assertNull(Question6.inOrderNext(mN14));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(mN7.getParent(), Question6.inOrderNext(mN7));
	}
	
	
	@Test
	public void test3() {
		Assert.assertEquals(mN8, Question6.inOrderNext(mN3));
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(mN11, Question6.inOrderNext(mRoot));
	}

}
