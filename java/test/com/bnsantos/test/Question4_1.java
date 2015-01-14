package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question1;
import com.bnsantos.utils.BinaryNode;

public class Question4_1 {
	private BinaryNode mRoot;
	private BinaryNode mNode8,mNode1;
	
	@Before
	public void init(){
		mRoot = new BinaryNode("0");
		BinaryNode n1 = new BinaryNode("1");
		BinaryNode n2 = new BinaryNode("2");
		BinaryNode n3 = new BinaryNode("3");
		BinaryNode n4 = new BinaryNode("4");
		BinaryNode n5 = new BinaryNode("5");
		BinaryNode n6 = new BinaryNode("6");
		BinaryNode n7 = new BinaryNode("7");
		BinaryNode n8 = new BinaryNode("8");
		BinaryNode n9 = new BinaryNode("9");
		BinaryNode n10 = new BinaryNode("10");
		BinaryNode n11 = new BinaryNode("11");
		BinaryNode n12 = new BinaryNode("12");
		BinaryNode n13 = new BinaryNode("13");
		BinaryNode n14 = new BinaryNode("14");
		
		mRoot.setLeft(n1);
		mRoot.setRight(n8);
		
		n1.setLeft(n2);
		n1.setRight(n5);
		
		n2.setLeft(n3);
		n2.setRight(n4);
		
		n5.setLeft(n6);
		n5.setRight(n7);
		
		n8.setLeft(n9);
		n8.setRight(n12);
		
		n9.setLeft(n10);
		n9.setRight(n11);
		
		n12.setLeft(n13);
		n12.setRight(n14);
		
		mNode1 = n1;
		mNode8 = n8;
	}

	@Test
	public void testBalanced1() {
		Assert.assertTrue(Question1.isBalanced(mRoot));
	}
	
	@Test
	public void testBalanced2() {
		mNode8.setLeft(null);
		mNode8.setRight(null);

		mNode1.setLeft(null);
		mNode1.setRight(null);
		Assert.assertTrue(Question1.isBalanced(mRoot));
	}

	@Test
	public void testUnBalanced1() {
		mNode1.setLeft(null);
		mNode1.setRight(null);
		Assert.assertFalse(Question1.isBalanced(mRoot));
	}
	
	@Test
	public void testUnBalanced2() {
		mNode8.setLeft(null);
		mNode8.setRight(null);
		Assert.assertFalse(Question1.isBalanced(mRoot));
	}
}
