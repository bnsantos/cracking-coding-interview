package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter4.Question5;
import com.bnsantos.utils.BinaryTreeNode;

public class Question4_5 {
	private BinaryTreeNode mRootNotBST;
	private BinaryTreeNode mRootNotBSTTricky;
	private BinaryTreeNode mRootBST;
	
	@Before
	public void init(){
		initNotBST();
		initNotBSTTricky();
		initBST();
	}
	
	private void initNotBST(){
		mRootNotBST = new BinaryTreeNode("0");
		BinaryTreeNode n1 = new BinaryTreeNode("1");
		BinaryTreeNode n2 = new BinaryTreeNode("2");
		BinaryTreeNode n3 = new BinaryTreeNode("3");
		BinaryTreeNode n4 = new BinaryTreeNode("4");
		BinaryTreeNode n5 = new BinaryTreeNode("5");
		BinaryTreeNode n6 = new BinaryTreeNode("6");
		BinaryTreeNode n7 = new BinaryTreeNode("7");
		BinaryTreeNode n8 = new BinaryTreeNode("8");
		BinaryTreeNode n9 = new BinaryTreeNode("9");
		BinaryTreeNode n10 = new BinaryTreeNode("10");
		BinaryTreeNode n11 = new BinaryTreeNode("11");
		BinaryTreeNode n12 = new BinaryTreeNode("12");
		BinaryTreeNode n13 = new BinaryTreeNode("13");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mRootNotBST.setLeft(n1);
		mRootNotBST.setRight(n8);
		
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
	}
	
	private void initBST(){
		mRootBST = new BinaryTreeNode("7");
		BinaryTreeNode n1 = new BinaryTreeNode("3");
		BinaryTreeNode n2 = new BinaryTreeNode("11");
		BinaryTreeNode n3 = new BinaryTreeNode("1");
		BinaryTreeNode n4 = new BinaryTreeNode("5");
		BinaryTreeNode n5 = new BinaryTreeNode("9");
		BinaryTreeNode n6 = new BinaryTreeNode("13");
		BinaryTreeNode n7 = new BinaryTreeNode("0");
		BinaryTreeNode n8 = new BinaryTreeNode("2");
		BinaryTreeNode n9 = new BinaryTreeNode("4");
		BinaryTreeNode n10 = new BinaryTreeNode("6");
		BinaryTreeNode n11 = new BinaryTreeNode("8");
		BinaryTreeNode n12 = new BinaryTreeNode("10");
		BinaryTreeNode n13 = new BinaryTreeNode("11");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mRootBST.setLeft(n1);
		mRootBST.setRight(n2);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setLeft(n5);
		n2.setRight(n6);
		n3.setLeft(n7);
		n3.setRight(n8);
		n4.setLeft(n9);
		n4.setRight(n10);
		n5.setLeft(n11);
		n5.setRight(n12);
		n6.setLeft(n13);
		n6.setRight(n14);
	}
	
	private void initNotBSTTricky(){
		mRootNotBSTTricky = new BinaryTreeNode("7");
		BinaryTreeNode n1 = new BinaryTreeNode("3");
		BinaryTreeNode n2 = new BinaryTreeNode("11");
		BinaryTreeNode n3 = new BinaryTreeNode("1");
		BinaryTreeNode n4 = new BinaryTreeNode("5");
		BinaryTreeNode n5 = new BinaryTreeNode("9");
		BinaryTreeNode n6 = new BinaryTreeNode("13");
		BinaryTreeNode n7 = new BinaryTreeNode("0");
		BinaryTreeNode n8 = new BinaryTreeNode("2");
		BinaryTreeNode n9 = new BinaryTreeNode("4");
		BinaryTreeNode n10 = new BinaryTreeNode("50");
		BinaryTreeNode n11 = new BinaryTreeNode("8");
		BinaryTreeNode n12 = new BinaryTreeNode("10");
		BinaryTreeNode n13 = new BinaryTreeNode("11");
		BinaryTreeNode n14 = new BinaryTreeNode("14");
		
		mRootNotBSTTricky.setLeft(n1);
		mRootNotBSTTricky.setRight(n2);
		n1.setLeft(n3);
		n1.setRight(n4);
		n2.setLeft(n5);
		n2.setRight(n6);
		n3.setLeft(n7);
		n3.setRight(n8);
		n4.setLeft(n9);
		n4.setRight(n10);
		n5.setLeft(n11);
		n5.setRight(n12);
		n6.setLeft(n13);
		n6.setRight(n14);
	}
	
	@Test
	public void testNotBST() {
		Assert.assertFalse(Question5.isBST(mRootNotBST));
	}
	
	@Test
	public void testNotBST2() {
		Assert.assertFalse(Question5.isBST(mRootNotBSTTricky, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	@Test
	public void testBST() {
		Assert.assertTrue(Question5.isBST(mRootBST));
	}

}
